package com.example.ABC.Telecom.repositories;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.ABC.Telecom.entities.customer;
import com.example.ABC.Telecom.entities.logincredentials;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class adminrepo {
	
	@Autowired
	private EntityManager em;
	
	public void addcustomer(customer c) {
		em.persist(c);
	}
	
	public void addmanager(logincredentials c) {
		em.persist(c);
	}
	
	public void addengineer(logincredentials c) {
		em.persist(c);
	}
	
	public List<customer> getcustomersforadmin(){
		Query q=em.createQuery("select e from customer e", customer.class);
		List<customer> c=q.getResultList();
		return c;
	}

}
