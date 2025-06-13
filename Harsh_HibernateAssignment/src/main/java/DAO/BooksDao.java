package DAO;

import Model.Book;

public interface BooksDao {
         
	void AddNewBook(Book b);
	void HQLUpdatePrice(int bid,double bprice);
	void HQLRemoveBook(int bid);
	void HQLGenerateBill(int bid,int bqty);
	void HQLSearchByTitle(String name);
	
	
	
}
