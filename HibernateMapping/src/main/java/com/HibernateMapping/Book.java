package com.HibernateMapping;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity 
public class Book {

	
	@Id 
	int bid;
	String bname;
	String author;
	
	
	public Book() {
		
	}


	public Book(int bid, String bname, String author) {
		super();
		this.bid = bid;
		this.bname = bname;
		this.author = author;
	}


	public int getBid() {
		return bid;
	}


	public void setBid(int bid) {
		this.bid = bid;
	}


	public String getBname() {
		return bname;
	}


	public void setBname(String bname) {
		this.bname = bname;
	}


	public String getAuthor() {
		return author;
	}


	public void setAuthor(String author) {
		this.author = author;
	}


	@Override
	public String toString() {
		return "Book [bid=" + bid + ", bname=" + bname + ", author=" + author + "]";
	}
	
	
	
	
	
}
