package com.techera.jpa.SprindJpaRelationshipCheck.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techera.jpa.SprindJpaRelationshipCheck.bean.ConsultDetailBean;
import com.techera.jpa.SprindJpaRelationshipCheck.entity.Doctor;
import com.techera.jpa.SprindJpaRelationshipCheck.entity.Patient;
import com.techera.jpa.SprindJpaRelationshipCheck.repository.DoctorRepository;


@Service
public class DoctorPatientDetailsService {
	
	@Autowired
	private DoctorRepository doctorRepository;

	public void insertData(ConsultDetailBean bean){
		Doctor doctor = new Doctor();		
		doctor.setD_name(bean.getD_name());
		//List<Patient> patientList = new ArrayList<Patient>();
		
		/*bean.getPatient().forEach(patient->{
			patient.setDoctorRef(doctor);
			patientList.add(patient);
		});
		doctor.setPatient(patientList);*/
		doctor.setPatient(bean.getPatient());
		doctorRepository.save(doctor);
		
	}
}
