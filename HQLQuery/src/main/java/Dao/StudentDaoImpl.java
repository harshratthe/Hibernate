package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import Connection.StudentConn;
import Model.Student;

public class StudentDaoImpl  implements StudentDaoI {
	
	
SessionFactory factory;
	
	public StudentDaoImpl()
	{
		factory=StudentConn.getSessionFactory();
	}

	
	
	
	
	

	@Override
	public void saveData(Student s) {
		Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        session.save(s);
        tx.commit();
        System.out.println("Student saved successfully.");


		
	}

	@Override
	public void removeByRoll(int rno) {
		Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Student s=session.get(Student.class,rno);
        if(s==null)
        {
        	System.out.println("User Not Found");
        }
        else
        {
        	session.delete(s);
        	System.out.println("User Deleted Sucessfully");
        }
        tx.commit();
		

		
	}







	@Override
	public void updateStudentByRollNo(int rno, String name, double marks) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		Student rs=session.get(Student.class,rno);
		
		if(rs==null)
		{
			System.out.println("User not found");
		}
		else
		{
			rs.setName(name);
			rs.setMarks(marks);
			session.update(rs);
			tx.commit();
			System.out.println("Updated Sucessfully");
		}

		
	}







	@Override
	public void searchByRoll(int rno) {
		 Session session = factory.openSession();
	        Transaction tx = session.beginTransaction();
	        Student s = session.get(Student.class,rno);
	        if (s != null) {
	            System.out.println(s);
	        } else {
	            System.out.println("Student not found.");
	        }
	        tx.commit();
	        session.close();

		
	}







	@Override
	public void ShowData() {

		Session session=factory.openSession();
		 Query<Student>  query= session.createQuery("from Student");
		 query.setFirstResult(0);  // Used for to display the records in the range form so this line will display starting records 
		 query.setMaxResults(5);   // And this line will display the ending records like up to the where it must display so this 
		                           // both line collectively will display 5 records from starting 
		
	List<Student> students=	 query.list();

	for(Student s : students )	
	{
		System.out.println(s.toString());
		
	}
	
	}







	@Override
	public void searchHQLName(String name) {
		
		Session session=factory.openSession();
		
		Query<Student>Q=session.createQuery("from Student where name=:name",Student.class);
		Q.setParameter("name", name);
		 List<Student> usersList=  Q.list();
		
		 for(Student  u : usersList )
		 {
			 System.out.println(u.toString());
		 }
		
	}







	@Override
	public void searchHQLNameMarks(String name, double marks) {
Session session=factory.openSession();
		
		Query<Student>Q=session.createQuery("from Student where name=:name and marks=:marks",Student.class);
		Q.setParameter("name", name);
		Q.setParameter("marks", marks);
		 List<Student> usersList=  Q.list();
		
		 for(Student  u : usersList )
		 {
			 System.out.println(u.toString());
		 }
		
	}







	@Override
	public void HQLMarksGreaterThan(double marks) {
Session session=factory.openSession();
		
		Query<Student>Q=session.createQuery("from Student where marks>:marks",Student.class);
		Q.setParameter("marks", marks);
		List<Student>usersList=Q.list();
		
		usersList.stream().forEach((i)->System.out.println(i));
		
		
		
	}







	@Override
	public void HQLDeleteByRoll(int rollno	) {
		Session session=factory.openSession();
		Transaction txTransaction=session.beginTransaction();
		Query <Student>Q=session.createQuery(" delete from Student where rollno=:rollno");
		Q.setParameter("rollno", rollno);
		int r=Q.executeUpdate();
		if(r>0)
		{
			System.out.println("Removed");
		}
		else 
			{
				System.out.println("Not Found");
			}
		
	}







	@Override
	public void HQLUpdateNameByRollNo(int rollno, String name) {
Session session=factory.openSession();
Transaction txTransaction=session.beginTransaction();
Query Q = session.createQuery("update Student set name = :name where rollno = :rollno");
       Q.setParameter("rollno", rollno);		
       Q.setParameter("name",name );
		 
		int r=Q.executeUpdate();
		if(r>0)
		{
			System.out.println("Updated");
		}
		else 
			{
				System.out.println("Not Found");
			}
		
		txTransaction.commit();
		
		
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	

}
