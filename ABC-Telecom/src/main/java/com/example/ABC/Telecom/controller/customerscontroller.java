package com.example.ABC.Telecom.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABC.Telecom.dto.complaintsdto;
import com.example.ABC.Telecom.dto.customerdto;
import com.example.ABC.Telecom.services.customerservice;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping(value="/customer")
public class customerscontroller {
	@Autowired
	private customerservice cs;
	
	@GetMapping("/{username}")
	public customerdto getcustomerdetails(@PathVariable String username) {
		return cs.sendcustomerdto(username);
		
	}
	
	@PostMapping
	public void getcomplaints(@RequestBody complaintsdto cd ) {
		System.out.println(cd);
		cs.savecomplaints(cd);
		
	}
	
	
	
}
