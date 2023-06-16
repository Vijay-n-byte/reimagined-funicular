package com.example.ABC.Telecom.repositories;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.example.ABC.Telecom.entities.admin;
import com.example.ABC.Telecom.entities.customer;
import com.example.ABC.Telecom.entities.logincredentials;

import jakarta.persistence.EntityManager;

@Repository
@Transactional
public class logincredentialsrepo {
	
	@Autowired
	private EntityManager em;
	
	
	public admin getadminlogins(String h) {
		return em.find(admin.class, h);
	}
	
	public void updateadminlogins(admin h) {
		em.merge(h);
	}
	
	public customer getcustomerlogins(String h) {
		return em.find(customer.class, h);
	}
	
	public logincredentials getmanagerlogins(String h) {
		return em.find(logincredentials.class, h);
	}
	
	public logincredentials getengineerlogins(String h) {
		return em.find(logincredentials.class, h);
	}
}
