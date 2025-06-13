package com.HibernateMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Student {

    @Id 	
	int rollno;
	String name;
	double makrs;
	
	
	
	@OneToOne(targetEntity=Address.class,cascade = CascadeType.ALL)                    //  mapping to the Class address 
	
	Address address;



	public Student() {
		
	}



	public Student(int rollno, String name, double makrs, Address address) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.makrs = makrs;
		this.address = address;
	}



	public int getRollno() {
		return rollno;
	}



	public void setRollno(int rollno) {
		this.rollno = rollno;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public double getMakrs() {
		return makrs;
	}



	public void setMakrs(double makrs) {
		this.makrs = makrs;
	}



	public Address getAddress() {
		return address;
	}



	public void setAddress(Address address) {
		this.address = address;
	}



	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", makrs=" + makrs + ", address=" + address + "]";
	}
	
	
	
	
	
	
}
