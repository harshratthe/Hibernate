package com.HQL2;

import Service.StudentService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        StudentService s=new StudentService();
        
    //     s.removeData();
        s.updateStudentByRoll();
        
        
    }
}
