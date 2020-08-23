package com.techera.jpa.SprindJpaRelationshipCheck.bean;

import java.util.List;

import com.techera.jpa.SprindJpaRelationshipCheck.entity.Patient;

public class ConsultDetailBean {
	private String d_name;
	private List<Patient> patient;
	public String getD_name() {
		return d_name;
	}
	public void setD_name(String d_name) {
		this.d_name = d_name;
	}
	public List<Patient> getPatient() {
		return patient;
	}
	public void setPatient(List<Patient> patient) {
		this.patient = patient;
	}
	
	
}
