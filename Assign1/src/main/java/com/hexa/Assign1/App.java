package com.hexa.Assign1;

import dao.Lmsdaoimpl;
import model.Lms;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       Lms lms=new Lms(112, "harsh", "harsh@mail.com" , "passs@123");
       Lms e2= new Lms(113,"manav","manav@gmail.com","pass@124");
       Lmsdaoimpl dao=new Lmsdaoimpl();
       
       
       
         dao.Signup(e2);
     // dao.ForgotPwd(112,"harsh@mail.com");
    // dao.Signin(112, "pass@123");
    //   dao.ListAllUsers();
    }
}
