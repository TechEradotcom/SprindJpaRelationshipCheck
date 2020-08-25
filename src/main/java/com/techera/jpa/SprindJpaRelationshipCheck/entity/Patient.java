package com.techera.jpa.SprindJpaRelationshipCheck.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "patient")
public class Patient {
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long p_id;
	@NotNull
	private String p_name;
	@NotNull
	private String p_emailid;
	/*@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="dctrref_id")
	private Doctor doctorRef;*/
	public Long getP_id() {
		return p_id;
	}
	public void setP_id(Long p_id) {
		this.p_id = p_id;
	}
	public String getP_name() {
		return p_name;
	}
	public void setP_name(String p_name) {
		this.p_name = p_name;
	}
	public String getP_emailid() {
		return p_emailid;
	}
	public void setP_emailid(String p_emailid) {
		this.p_emailid = p_emailid;
	}
	/*public Doctor getDoctorRef() {
		return doctorRef;
	}
	public void setDoctorRef(Doctor doctorRef) {
		this.doctorRef = doctorRef;
	}*/
	
	
	
}
