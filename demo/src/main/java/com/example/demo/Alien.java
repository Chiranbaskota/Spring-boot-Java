package com.example.demo;


import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Qualifier;
//import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
//@Scope(value="prototype")

public class Alien {

	
	private int aid;
	private String aname;
	private String tech;
	@Autowired
	//@Qualifier("l1")
	private Laptop l1;
	
	public Alien() {
		System.out.println("Object Created...");
	}
	public int getAid() {
		return aid;
	}
	public void setAid(int aid) {
		this.aid = aid;
	}
	public String getAname() {
		return aname;
	}
	public void setAname(String aname) {
		this.aname = aname;
	}
	public String getTech() {
		return tech;
	}
	public void setTech(String tech) {
		this.tech = tech;
	}
	
	public Laptop getL1() {
		return l1;
	}
	public void setL1(Laptop l1) {
		this.l1 = l1;
	}
	public void show() {
		System.out.println("We show that thing.");
		l1.compile();
	}
	
	
	
}
