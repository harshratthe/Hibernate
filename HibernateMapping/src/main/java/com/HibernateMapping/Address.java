package com.HibernateMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Address {

	
	@Id 
	int adressid;
	String city;
	
	
	public Address() {
		
		
	}


	public Address(int adressid, String city) {
		super();
		this.adressid = adressid;
		this.city = city;
	}


	public int getAdressid() {
		return adressid;
	}


	public void setAdressid(int adressid) {
		this.adressid = adressid;
	}


	public String getCity() {
		return city;
	}


	public void setCity(String city) {
		this.city = city;
	}


	@Override
	public String toString() {
		return "Address [adressid=" + adressid + ", city=" + city + "]";
	}
	
	
	
}
