package com.Assignment_Hibernate;

import Service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

         BookService bs=new BookService();
    //	  bs.addBookService();
       //  bs.UpdatePrice();
      //   bs.RemoveBook();
         bs.GenerateBill();
       // bs.SearchByTitle();
    }
}
