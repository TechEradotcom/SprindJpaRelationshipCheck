package com.techera.jpa.SprindJpaRelationshipCheck.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.techera.jpa.SprindJpaRelationshipCheck.bean.ConsultDetailBean;
import com.techera.jpa.SprindJpaRelationshipCheck.entity.Doctor;
import com.techera.jpa.SprindJpaRelationshipCheck.repository.DoctorRepository;


@Service
public class DoctorPatientDetailsService {
	
	@Autowired
	private DoctorRepository doctorRepository;

	public Doctor insertData(ConsultDetailBean bean){
		Doctor doctor = new Doctor();		
		doctor.setD_name(bean.getD_name());
		doctor.setPatient(bean.getPatient());
		Doctor doctorResponse = doctorRepository.save(doctor);
		return doctorResponse;
	}
}
