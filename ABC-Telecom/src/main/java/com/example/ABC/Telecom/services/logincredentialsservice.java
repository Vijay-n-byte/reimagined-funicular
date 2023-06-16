package com.example.ABC.Telecom.services;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ABC.Telecom.dto.logindto;
import com.example.ABC.Telecom.entities.admin;
import com.example.ABC.Telecom.entities.customer;
import com.example.ABC.Telecom.entities.logincredentials;
import com.example.ABC.Telecom.repositories.logincredentialsrepo;

@Service
public class logincredentialsservice {
	
	@Autowired
	private logincredentialsrepo lcr;
	
	
	
	public logindto validateadminusername(String s) {
	    admin l=lcr.getadminlogins(s);
		logindto ld=new logindto();
		if(l==null) {
			ld=null;
			return ld;
		}
		else {
			ld.setUsername(l.getUsername());
			ld.setPassword(l.getPassword());
			return ld;
		}
	
	}
	
	public logindto getlogindto(String h) {
		 customer l=lcr.getcustomerlogins(h);
		 logindto ld=new logindto();
			if(l==null) {
				ld=null;
				return ld;
			}
			else {
				ld.setUsername(l.getUsername());
				ld.setPassword(l.getPassword());
				return ld;
			}
	}
	
	public logindto getmanagerlogin(String h) {
		 logincredentials l=lcr.getmanagerlogins(h);
		 logindto ld=new logindto();
			if(l==null) {
				ld=null;
				return ld;
			}
			else {
				ld.setUsername(l.getUsername());
				ld.setPassword(l.getPassword());
				return ld;
			}
	}
	
	public logindto getengineerlogin(String h) {
		 logincredentials l=lcr.getengineerlogins(h);
		 logindto ld=new logindto();
			if(l==null) {
				ld=null;
				return ld;
			}
			else {
				ld.setUsername(l.getUsername());
				ld.setPassword(l.getPassword());
				return ld;
			}
	}
	
	

	
}
