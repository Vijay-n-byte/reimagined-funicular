package com.example.ABC.Telecom.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABC.Telecom.dto.assigndto;
import com.example.ABC.Telecom.entities.complaints;
import com.example.ABC.Telecom.repositories.customerrepo;

@Service
public class managerservice {

	@Autowired
	private customerrepo crr;
	
	public void updatecomplaints(assigndto a) {
		complaints c=crr.getcomplaint(a.getTicketnumber());
		System.out.println(c);
		c.setAsignedto(a.getUsername());
		crr.updatecomplaintsofcustomer(c);
	}
}
