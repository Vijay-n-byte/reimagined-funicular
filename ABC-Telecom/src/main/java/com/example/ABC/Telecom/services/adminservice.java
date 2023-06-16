package com.example.ABC.Telecom.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABC.Telecom.entities.customer;
import com.example.ABC.Telecom.entities.logincredentials;
import com.example.ABC.Telecom.repositories.adminrepo;

@Service
public class adminservice {
	
	@Autowired
	private adminrepo ar;
	
	public void addcustomers1(customer c) {
		ar.addcustomer(c);
	}
	
	public void addengineer1(logincredentials c) {
		ar.addengineer(c);
	}
	public void addmanager1(logincredentials c) {
		ar.addmanager(c);
	}
	
	public List<customer> getcust(){
		return ar.getcustomersforadmin();
	}
	
	

}
