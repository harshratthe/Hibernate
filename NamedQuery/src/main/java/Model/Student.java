package Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;

@Entity
   

@NamedQueries({
	
	
	@NamedQuery(name="Student.findAll",query ="from Student" ), 
	@NamedQuery(name="Student.removeByRoll",query ="delete from Student where rollno=:rollno" ),
	@NamedQuery(name="Student.DetailsByName",query ="from Student where name=:name" )

})
public class Student {
	@Id
	int rollno;
	String name;
	double marks;
	
	public Student()
	{
		
	}
	
	
 
	public Student(int rollno, String name, double marks) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.marks = marks;
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
 
	public double getMarks() {
		return marks;
	}
 
	public void setMarks(double marks) {
		this.marks = marks;
	}
 
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", marks=" + marks + "]";
	}

}
