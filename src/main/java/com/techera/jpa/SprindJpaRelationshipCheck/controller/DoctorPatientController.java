package com.techera.jpa.SprindJpaRelationshipCheck.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.techera.jpa.SprindJpaRelationshipCheck.bean.ConsultDetailBean;
import com.techera.jpa.SprindJpaRelationshipCheck.entity.Doctor;
import com.techera.jpa.SprindJpaRelationshipCheck.service.DoctorPatientDetailsService;

@RestController
public class DoctorPatientController {
	
	@Autowired
	DoctorPatientDetailsService dpService;
		
		@PostMapping("/health/doctor/create")	
	    public ResponseEntity<?> createRole(@RequestBody ConsultDetailBean bean) {	
	        dpService.insertData(bean);
	        return ResponseEntity.ok().build();
	    }
}
