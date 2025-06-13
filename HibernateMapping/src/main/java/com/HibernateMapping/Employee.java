package com.HibernateMapping;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Employee {

	
	@Id
	int empid;
	String emp_name;
	Double salary;
	
	public Employee() {
		
	}

	public Employee(int empid, String emp_name, Double salary) {
		super();
		this.empid = empid;
		this.emp_name = emp_name;
		this.salary = salary;
	}

	public int getEmpid() {
		return empid;
	}

	public void setEmpid(int empid) {
		this.empid = empid;
	}

	public String getEmp_name() {
		return emp_name;
	}

	public void setEmp_name(String emp_name) {
		this.emp_name = emp_name;
	}

	public Double getSalary() {
		return salary;
	}

	public void setSalary(Double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [empid=" + empid + ", emp_name=" + emp_name + ", salary=" + salary + "]";
	}
	
	

	
	
	
	
}
