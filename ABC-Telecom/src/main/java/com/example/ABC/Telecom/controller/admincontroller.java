package com.example.ABC.Telecom.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABC.Telecom.entities.customer;
import com.example.ABC.Telecom.entities.logincredentials;
import com.example.ABC.Telecom.services.adminservice;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping(value="/admin")
public class admincontroller {
	
	@Autowired
	private adminservice as;
	
	@PostMapping("/customer")
	public void addcustomerbyadmin(@RequestBody customer c) {
		as.addcustomers1(c);

	}
	
	@GetMapping("/customer")
	public List<customer> getcustomerbyadmin() {
		return as.getcust();

	}
	
	
	
	@PostMapping("/engineer") 
	public void addengineerbyadmin(@RequestBody logincredentials c) {
		as.addengineer1(c);

	}
	
	@PostMapping("/manager")
	public void addmanagerbyadmin(@RequestBody logincredentials c) {
		as.addmanager1(c);

	}
	
	

}
