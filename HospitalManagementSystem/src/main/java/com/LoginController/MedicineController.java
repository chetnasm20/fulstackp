package com.LoginController;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.docLogin.repository.MedicinesRepository;
import com.doctlogin.entity.Medicine;
@CrossOrigin(origins="https://localhost:4200")
@RestController
@RequestMapping("/api/v3")
public class MedicineController {
	
	@Autowired
	private MedicinesRepository medicineRepository;

	
	@PostMapping("/insert")
    public Medicine createMedicine(@RequestBody Medicine medicine)
    {
		return medicineRepository.save(medicine);
    	
    }

	
	@GetMapping
	public List<Medicine> getAllMedicines()
	{
		return medicineRepository.findAll();

     }
}