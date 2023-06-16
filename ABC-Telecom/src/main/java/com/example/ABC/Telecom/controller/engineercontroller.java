package com.example.ABC.Telecom.controller;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.ABC.Telecom.dto.statuschangedto;
import com.example.ABC.Telecom.entities.complaints;
import com.example.ABC.Telecom.services.customerservice;
import com.example.ABC.Telecom.services.engineerservice;
import com.example.ABC.Telecom.services.managerservice;

@RestController
@CrossOrigin("http://localhost:4200/")
@RequestMapping(value="/engineer")
public class engineercontroller {
	
	@Autowired
	private customerservice cs;
	
	@Autowired
	private managerservice ms;
	
	@Autowired
	private engineerservice es;
	
	@GetMapping("/{username}")
	public List<complaints> getengineercomplaints1(@PathVariable String username){
		return cs.getengineercomplaints(username);
		
	}
	
	@PostMapping
	public void setcomplaintstatus(@RequestBody statuschangedto u){
		es.updatecomplaints1(u);
		
	}
	
	
	

}
