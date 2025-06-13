package DAO;

import java.util.List;

import org.hibernate.Session;


import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import Model.Book;
import Util.HibernateUtil;

public class BooksDaoImpl implements BooksDao{
	
	
	SessionFactory factory;
	
	
	
	public BooksDaoImpl() {
		factory=HibernateUtil.getSessionFactory();
	}

	@Override
	public void AddNewBook(Book b) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		session.save(b);
        tx.commit();
        System.out.println("Book added successfully.");
		
	}

	@Override
	public void HQLUpdatePrice(int bookid, double price) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Query q=session.createQuery("update Book set price=:price where bookid=:bookid" );
		q.setParameter("bookid",bookid);
		q.setParameter("price",price);
		int r=q.executeUpdate();
		if(r>0)
		{
			System.out.println("Price Updated");
		}
		else 
			{
				System.out.println("Book Not Found");
			}
		
		tx.commit();
		
	}

	@Override
	public void HQLRemoveBook(int bookid) {
		Session session=factory.openSession();
		Transaction tx=session.beginTransaction();
		Query <Book>Q=session.createQuery(" delete from Book where bookid=:bookid");
		Q.setParameter("bookid", bookid);
		int r=Q.executeUpdate();
		if(r>0)
		{
			System.out.println("Book Removed");
		}
		else 
			{
				System.out.println("Book Not Found");
			}
		tx.commit();
	}

	@Override
	public void HQLGenerateBill(int bookid, int quantity) {
		Session session=factory.openSession();
		 Transaction tx = session.beginTransaction();
		 
		 
		 Book b=session.get(Book.class,bookid);
		 
		 if(b==null) {
			 System.out.println("No Book exixts with such BookId");
		 }
		 else if(b.getQuantity()<quantity) {
			 System.out.println("Insufficeint stocks , Available Stocks :" +b.getQuantity() );
		 }
		 else {
			 double price=b.getPrice();
			 double totalamount=price*quantity;
			 
			 
			 System.out.println("Book Title :  " + b.getTitle() );
			 System.out.println("Book Price: " +  b.getPrice());
			 System.out.println("Total Bill " + totalamount);
			 session.update(b);
			 tx.commit();
			 
			 
			 int updatestock=b.getQuantity() - quantity;
			 b.setQuantity(updatestock);
			 
			 
		 }
		 
		 

		
	}

	@Override
	public void HQLSearchByTitle(String title) {
            Session session=factory.openSession();
		
		Query<Book>Q=session.createQuery("from Book where title=:title",Book.class);
		Q.setParameter("title", title);
		List<Book> bookList=  Q.list();
		
		bookList.stream().forEach((i)->System.out.println(i));
	}

}
