package com.LoginController;
import java.util.*;
import java.util.List;
import java.util.Map;

import javax.management.AttributeNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docLogin.repository.AppointmentsRepository;
import com.doctlogin.entity.Appointment;
@CrossOrigin(origins="http://localhost:4200")
@RestController
@RequestMapping("/api/v2")
public class AppointmentController {

	    @Autowired
		AppointmentsRepository appointmentRepository;
	
	    @PostMapping("/insert")
	    public Appointment createAppointment(@RequestBody Appointment appointment)
	    {
			return appointmentRepository.save(appointment);
					
	    }
	    
	    @GetMapping
	    public List<Appointment> getAllAppointment()
	    {
	    	return appointmentRepository.findAll();
	    }
	    
	    @DeleteMapping("/appointments/{id}")
	    	public ResponseEntity<Map<String,Boolean>>deleteAppointment(@PathVariable long id) throws AttributeNotFoundException{
	    	Appointment appointment=appointmentRepository.findById(id).orElseThrow(()->new AttributeNotFoundException("Appointment not found with id"+id));
	    	appointmentRepository.delete(appointment);
	    	Map<String,Boolean>response=new HashMap<String,Boolean>();
	    	response.put("DEleted", Boolean.TRUE);
	    	return ResponseEntity.ok(response);
	    
	    }
	    }
	    
	    

