package com.techera.jpa.SprindJpaRelationshipCheck.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.techera.jpa.SprindJpaRelationshipCheck.entity.Patient;

@Repository
public interface PatientRepository extends JpaRepository<Patient, Long>{

}
