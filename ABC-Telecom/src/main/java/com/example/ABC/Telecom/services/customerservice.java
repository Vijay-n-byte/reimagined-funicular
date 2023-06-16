package com.example.ABC.Telecom.services;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABC.Telecom.dto.complaintsdto;
import com.example.ABC.Telecom.dto.customerdto;
import com.example.ABC.Telecom.dto.managerdto;
import com.example.ABC.Telecom.entities.complaints;
import com.example.ABC.Telecom.entities.customer;
import com.example.ABC.Telecom.repositories.customerrepo;

@Service
public class customerservice {

	@Autowired
	private customerrepo cr;
	
	public customerdto sendcustomerdto(String h) {
		customer y=cr.getcustomer(h);
		customerdto b=new customerdto();
		b.setUsername(y.getUsername());
		b.setProductno(y.getProductno());
		b.setComplaints1(y.getC());
		return b;
		
	}
	
	public void savecomplaints(complaintsdto cd) {
		customer c=cr.getcustomer(cd.getUsername());
		complaints comp=new complaints();
		
		comp.setComplaint(cd.getCom());
		comp.setCust(c);
		comp.setStatus(1);
		comp.setPincode(cd.getPincode());
		cr.savecomplaintsofcustomer(comp);
	}
	
	public managerdto getmanagerdto() {
		managerdto mg=new managerdto();
		mg.setC(cr.getcomplaintsformanager());
		mg.setL(cr.getengineersfformanagers());
		System.out.print(mg);
	    return mg;
	}
	
	public List<complaints> getengineercomplaints(String h) {
		return cr.getcomplaintsforengineers(h);
	}
	
	
	
	
}
