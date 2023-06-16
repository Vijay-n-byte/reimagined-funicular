package com.example.ABC.Telecom.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABC.Telecom.dto.statuschangedto;
import com.example.ABC.Telecom.entities.complaints;
import com.example.ABC.Telecom.repositories.customerrepo;

@Service
public class engineerservice {
	
	@Autowired
	private customerrepo crr;
	
	public void updatecomplaints1(statuschangedto a) {
		complaints c=crr.getcomplaint(a.getTicketnumber());
		System.out.println(c);
		c.setStatus(0);
		crr.updatecomplaintsofcustomer(c);
	}

}
