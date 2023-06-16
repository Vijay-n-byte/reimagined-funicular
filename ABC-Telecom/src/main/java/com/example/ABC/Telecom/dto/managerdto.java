package com.example.ABC.Telecom.dto;

import java.util.List;

import com.example.ABC.Telecom.entities.complaints;
import com.example.ABC.Telecom.entities.logincredentials;



public class managerdto {
	
	private List<complaints> c;
	private List<logincredentials> l;
	public List<complaints> getC() {
		return c;
	}
	public void setC(List<complaints> c) {
		this.c = c;
	}
	public List<logincredentials> getL() {
		return l;
	}
	public void setL(List<logincredentials> l) {
		this.l = l;
	}
	public managerdto() {
		super();
	}
	@Override
	public String toString() {
		return "managerdto [c=" + c + ", l=" + l + "]";
	}
	
	

}
