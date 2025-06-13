package com.HibernateMapping;

import java.util.ArrayList;
import java.util.List;

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
    public static void main( String[] args )
    {
   /*	 SessionFactory sessionFactory= new Configuration().
    			   configure("hiber.config.xml").
    			   addAnnotatedClass(Student.class).
    			   addAnnotatedClass(Address.class).
    			   buildSessionFactory();	
    	
    	
    	Session session=sessionFactory.openSession();
    	
    	Transaction txt=session.beginTransaction();
    	
    	
    	
    	Address a1= new Address();
        a1.setAdressid(1);
        a1.setCity("bombay");
        
        
        
        Student s1 = new Student();
        s1.setRollno(101);
        s1.setName("Ajay");
        s1.setAddress(a1);
        
        
        session.save(s1);
        txt.commit();
    	
    	*/
    	
    	/*  SessionFactory sessionFactory= new Configuration().
    			   configure("hiber.config.xml").
    			   addAnnotatedClass(Employee.class).
    			   addAnnotatedClass(Department.class).
    			   buildSessionFactory();

    	          Session session =sessionFactory.openSession();
    	          Transaction txt =session.beginTransaction();

    	           Employee e1= new Employee(101,"asha",3000.0);
    	           Employee e2= new Employee(102,"jay",7000.0);
    	 
    	          
    	          List<Employee> list= new ArrayList();
    	          list.add(e1);
    	          list.add(e2);

    	          Department ojbD= new Department();
    	          ojbD.setDeptcode(1);
    	          ojbD.setDeptname("Admin");
    	          ojbD.setEmplist(list);

    	          session.save(ojbD);
    	          txt.commit();                        */

     	
     	
    	   /*     SessionFactory sessionFactory= new Configuration().
    	    			   configure("hiber.config.xml").
    	    			   addAnnotatedClass(Book.class).
    	    			   addAnnotatedClass(Library.class).
    	    			   buildSessionFactory();
    	          

    	          Session s =sessionFactory.openSession();
    	          Transaction txt =s.beginTransaction();
    	          
    	          
    	          
    	          Book b1=new Book(1,"DSA","Chavan");
    	          Book b2=new Book(2,"Physics" ,"HC VERMA");
    	          
    	          
    	          
    	          List<Book>books=new ArrayList();
    	          books.add(b1);
    	          books.add(b2);
    	          
    	          Library l1= new Library();
    	          l1.setLid(101);
    	          l1.setLname("Exynos Library");
    	          l1.setLcity("Mumabi");
    	          l1.setBooks(books);
    	          
    	          s.save(l1);
    	          txt.commit();                         */
    	
    	SessionFactory sessionFactory= new Configuration().
    			   configure("hiber.config.xml").
    			   addAnnotatedClass(Employee.class).
    			   addAnnotatedClass(Department.class).
    			   buildSessionFactory();

    	          Session session =sessionFactory.openSession();
    	
    	Department  d= session.get(Department.class, 1);

        System.out.print( d.getDeptname());
       // System.out.print(d.getEmplist());
    	
    	
    	
    	
    	
    	          
    	          
     	

    	 
        
    }
}
