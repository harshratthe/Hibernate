package Dao;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.NativeQuery;

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
		
Session session=factory.openSession();
		
		Transaction txt=session.beginTransaction();
		
		
		Query <Student>q=session.createNamedQuery("Student.removeByRoll");
		q.setParameter("rollno", rno);
		
		
		int r=q.executeUpdate();
		if(r>0)
		{
			System.out.println("Removed");
		
			}
		else
		{
			
			System.out.println("Not Found");
 
	
		}
		
		
		txt.commit();
		
		

		
	}







	@Override
	public void updateStudentByRollNo(int rno, String name, double marks) {
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		NativeQuery<Student> q=session.createNativeQuery("update student set name=:name , marks=:marks where rollno=:rollno", Student.class);
		q.setParameter("rollno", rno);
		q.setParameter("name", name);
		q.setParameter("marks", marks);
		int r=q.executeUpdate();
		if(r>0)
		{
			System.out.println("Updated Sucessfully");
		}
		else
		{
			  System.out.println("No rollno found ");
			
		}
		session.update(r);
		tx.commit();
		
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
		
		
Query<Student> query=session.createNamedQuery("Student.findAll", Student.class);		
		List<Student> usersList=query.list();
		
		
		
		
		
	List<Student> students=	 query.list();
 
	for(Student s : students )	
	{
		System.out.println(s.toString());
		
	}
	
	}







	@Override
	public void searchHQLName(String name) {
		
		Session session=factory.openSession();
		
		Query<Student>Q=session.createNamedQuery("Student.DetailsByName",Student.class);
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
