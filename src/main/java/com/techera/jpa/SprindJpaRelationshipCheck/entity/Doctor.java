package com.techera.jpa.SprindJpaRelationshipCheck.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "doctor")
public class Doctor {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long d_id;
	
	@NotNull
	private String d_name;	
	
	//mappedBy="doctorRef",
	@OneToMany(targetEntity = Patient.class, cascade=CascadeType.ALL,orphanRemoval=true)
	@JoinColumn(name="dctrf_id", referencedColumnName="d_id")
	private List<Patient> patient;

	public Long getD_id() {
		return d_id;
	}

	public void setD_id(Long d_id) {
		this.d_id = d_id;
	}

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
