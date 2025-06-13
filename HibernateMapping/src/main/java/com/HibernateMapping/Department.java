package com.HibernateMapping;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;


@Entity 
public class Department {
    
	@Id
	int deptcode;
	String deptname;
	
	@OneToMany(targetEntity=Employee.class,cascade =CascadeType.ALL,fetch =FetchType.LAZY)
	List<Employee>emplist;

	public Department() {
		
	}

	public Department(int deptcode, String deptname, List<Employee> emplist) {
		super();
		this.deptcode = deptcode;
		this.deptname = deptname;
		this.emplist = emplist;
	}

	public int getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(int deptcode) {
		this.deptcode = deptcode;
	}

	public String getDeptname() {
		return deptname;
	}

	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	public List<Employee> getEmplist() {
		return emplist;
	}

	public void setEmplist(List<Employee> emplist) {
		this.emplist = emplist;
	}

	@Override
	public String toString() {
		return "Department [deptcode=" + deptcode + ", deptname=" + deptname + ", emplist=" + emplist + "]";
	}
	
	
	
	
}
