package com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.entity.Patient;
@Repository
public interface PatientRepository extends JpaRepository<Patient,Long>{

}
