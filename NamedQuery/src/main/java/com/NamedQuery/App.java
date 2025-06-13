package com.NamedQuery;

import Service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       StudentService s=new  StudentService();
      // s.showAll();
      // s.removeData();
       s.searchByname();
    }
}
