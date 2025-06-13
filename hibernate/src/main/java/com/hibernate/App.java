package com.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
   
SessionFactory  sessionFactory;  // interface
	
	Session  session;
	public App() {
		
      sessionFactory= new Configuration().configure("hiber.config.xml").addAnnotatedClass(Student.class).buildSessionFactory();
    	
    	session=sessionFactory.openSession();
	}
	
	
	void insert()
	{
		
    	Transaction txTransaction= session.beginTransaction();
    	
    	Student s= new Student();
    	s.setRollno(107);
    	s.setName("ajay");
    	s.setMarks(10000.0);
    	
    	session.save(s);
    	txTransaction.commit();
	}
	
	
	
	void search(int rollno)
	{
		
    	session=sessionFactory.openSession();
    Student rs=	session.get(Student.class, rollno);
   
     if(rs!=null)
    {
    	System.out.println(rs.toString());
    }
    else {
    	System.out.println("Not Found");
 
    	
	}
 
	}
	
	
	
	void removeByRollNo(int rno)
	{
	
		session=sessionFactory.openSession();
    	Transaction txTransaction= session.beginTransaction();
    	
    	Student r=session.find(Student.class, rno);
    	
    	if(r==null)
    	{
    		System.out.println("Not Found");
    	}
    	else {
    		
		
    	session.delete(r);
    		}
    		
    	txTransaction.commit();
 
	}
	
	
	void updateNameFee(int roll,double marks,String name)
	{
		
		session=sessionFactory.openSession();
    	Transaction txTransaction= session.beginTransaction();
    	
    	Student s=session.find(Student.class,roll);
    	if(s==null) 
    	{
    	System.out.println("Not found");
    	}
	else 
	{
    	s.setRollno(107);
    	s.setName(name);
    	s.setMarks(marks);
    	
    	session.update(s);
	}
    	txTransaction.commit();
 
    	
	}
	
	
 
	
    public static void main( String[] args )
    {
    	
    	
    	
    	
    App obj= new App();
    
    	// obj.insert();
    	
    // 	obj.search(107);
    	
  //   obj.removeByRollNo(101);	
    
    obj.updateNameFee(108, 50,"aman");;
    	
        System.out.println( "Hello World!" );
    }
    	
    	
    	
    	
    	
    }

