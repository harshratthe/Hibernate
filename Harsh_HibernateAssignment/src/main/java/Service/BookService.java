package Service;

import java.util.Scanner;

import DAO.BooksDaoImpl;
import Model.Book;

public class BookService {
     
	
	BooksDaoImpl dao=new BooksDaoImpl();
	Scanner sc=new Scanner(System.in);
	
	public void addBookService() {
		System.out.println("Enter BookId: ");
		int bid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Book Ttile : ");
		String bname=sc.nextLine();
		System.out.println("Enter Book Author: ");
		String Aname=sc.nextLine();
		System.out.println("Enter Book Price: ");
		double bprice=sc.nextDouble();
		System.out.println("Enter Quantity : ");
		int bqty=sc.nextInt();
		
		
		Book s=new Book(bid,bname,Aname,bprice,bqty);
		dao.AddNewBook(s);
		System.out.println("Book addedd successfully");
		
		
		
	}
	
	public void UpdatePrice() {
		System.out.println("Enter BookID:  ");
		int bid=sc.nextInt();
		sc.nextLine();
		
		System.out.println("Enter Price to be Updated: ");
		double bprice=sc.nextDouble();
		
		dao.HQLUpdatePrice(bid,bprice);
		
		
		
		
	}
	
	
	public void RemoveBook() {
		System.out.println("Enter the BookId: ");
		int bid=sc.nextInt();
		dao.HQLRemoveBook(bid);
	}
   
	
	public void GenerateBill() {
		System.out.println("Enter BookID: ");
	    int  bid=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter Quantity : ");
		int bqty=sc.nextInt();
		dao.HQLGenerateBill(bid,bqty);
		
	}

	public void SearchByTitle() {
		System.out.println("Enter Book Title: ");
		String name=sc.nextLine();
		dao.HQLSearchByTitle(name);
	}
	
	

}
