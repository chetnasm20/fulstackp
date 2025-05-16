package com.docLogin.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.doctlogin.entity.Appointment;
import com.doctlogin.entity.Medicine;
@Repository
public interface AppointmentsRepository extends JpaRepository<Appointment,Long>{

	

}
