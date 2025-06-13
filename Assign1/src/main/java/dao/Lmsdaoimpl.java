package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import model.Lms;
import util.ConnectionHelper;

public class Lmsdaoimpl implements Lmsdao{
	
	static Connection conn;
    PreparedStatement stat;

     
	
	
	

	@Override
	public void Signup(Lms l) {
		 try {
			 String sql = "insert into  lms values(?, ?, ?, ?)";

	            conn=ConnectionHelper.getConnection();
	            stat = conn.prepareStatement(sql);

	            stat.setInt(1, l.getUserid());
	            stat.setString(2, l.getName());
	            stat.setString(3, l.getEmail());
	            stat.setString(4, l.getPassword());

	            stat.executeUpdate();
	            System.out.println("Signup Successfull.");
	        } catch (Exception e) {
	        	e.printStackTrace();
	            System.out.println("Signup error: " + e.getMessage());
	        }
		
		
	}

	@Override
	public void ForgotPwd(int userid, String email) {
		 try {
	            String sql = "Select password from LMS where userid=? and email=?";
	            stat = conn.prepareStatement(sql);

	            stat.setInt(1,userid);
	            stat.setString(2, email);
	            ResultSet rs=stat.executeQuery();
	            
	            if (rs.next()) {
	                System.out.println(" password : " + rs.getString("password"));
	            } else {
	                System.out.println("Invalid userId or email."); ;
	            }

	            
	        } catch (Exception e) {
	            System.out.println("S error: " + e.getMessage());
	        }	
	}

	@Override
	public void Signin(int userid, String password) {
		
		 try {
	            String sql = "Select name from Lms where userid=? and password=?";
	            conn=ConnectionHelper.getConnection();
	            stat.setInt(1, userid);
	            stat.setString(2, password);
	            ResultSet rs=stat.executeQuery();
	            if(rs.next()) {
	            	System.out.println("User name :- " + rs.getString("name"));
	            }
	            else {
	            	System.out.println("Invalid userid and pwd");
	            }
	            
	    

	            
	        } catch (Exception e) {
	            System.out.println(" error: " + e.getMessage());
	        }	
		
	}

	@Override
	public void ListAllUsers() {
		 ArrayList<Lms>list=new ArrayList<>();
		 
		 
		 try {
			 String sql="select name , userid from LMS ";
	            conn=ConnectionHelper.getConnection();
	            stat=conn.prepareStatement(sql);
	            ResultSet rs=stat.executeQuery();
	            while(rs.next()) {
	            	System.out.println(rs.getString("name"));
	            	System.out.println(rs.getInt("userid"));
	            }
	            
	            
	           
	            
	    

	            
	        } catch (Exception e) {
	            System.out.println(" error: " + e.getMessage());
	        }	
		
	}

	
	

}
