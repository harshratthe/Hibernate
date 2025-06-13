package com.HibernateMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity 
public class Library {

	@Id 
	int lid;
	String lname;
	String lcity;
	
	
	@OneToMany(targetEntity=Book.class,cascade =CascadeType.ALL)
	List<Book> books;


	public Library() {
		
	}


	public Library(int lid, String lname, String lcity, List<Book> books) {
		super();
		this.lid = lid;
		this.lname = lname;
		this.lcity = lcity;
		this.books = books;
	}


	public int getLid() {
		return lid;
	}


	public void setLid(int lid) {
		this.lid = lid;
	}


	public String getLname() {
		return lname;
	}


	public void setLname(String lname) {
		this.lname = lname;
	}


	public String getLcity() {
		return lcity;
	}


	public void setLcity(String lcity) {
		this.lcity = lcity;
	}


	public List<Book> getBooks() {
		return books;
	}


	public void setBooks(List<Book> books) {
		this.books = books;
	}


	@Override
	public String toString() {
		return "Library [lid=" + lid + ", lname=" + lname + ", lcity=" + lcity + ", books=" + books + "]";
	}
	
	
	
	
}
