package com.qsp.LoginPage;

import java.io.IOException;

import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.qsp.model.Person;


public class LoginDetails extends HttpServlet{
	
	

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException,IOException
	{
		String pass=request.getParameter("upass");
		String email=request.getParameter("uemail");
		String lemailid=request.getParameter("lemailid");
		String lpassword=request.getParameter("lpassword");
		String op1=request.getParameter("btn1");
		
		
		
	
	
	
   PrintWriter out=response.getWriter();
   out.print( "<!DOCTYPE html>\r\n"
   		+ "<html>\r\n"
   		+ "<head>\r\n"
   		+ "<meta charset=\"ISO-8859-1\">\r\n"
   		+ "<title>Login Page</title>\r\n"
   		+ "\r\n"
   		+ "</head>\r\n"
   		+ "<body bgcolor=\"cyan\">\r\n"
   		+ "<form action=\"login\" method=\"post\" >\r\n"
   		+ "\r\n"
   		+ " \r\n"
   		+ "EMAILID<input type=\"text\" name=\"lemailid\"><br>\r\n"
   		+ "\r\n"
   		+ "PASSWORD<input type=\"text\" name=\"lpassword\"><br>\r\n"
   		+ "\r\n"
   		+ "LOGIN<input type=\"submit\" value=\"login1\" name=\"btn1\"><br>\r\n"
   		+ "\r\n"
   		+ "<a href=\"register.html\">Register\r\n"
   		+ "\r\n"
   		+ "\r\n"
   		+ "</form>\r\n"
   		+ "\r\n"
   		+ "\r\n"
   		+ "</body>\r\n"
   		+ "</html>"
   );
   
  
   try {
	   Class.forName("com.mysql.jdbc.Driver");
    	Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Siddhesh@123");
    	
    	
		//select * from login.logintable where password=? and username=?
		
    	System.out.println("1");
    	if(op1.equals("login1"))
		{
    		 String lQuery ="SELECT * FROM login.logintable WHERE emailid=? and password=?";
    		 PreparedStatement pstmt=  con.prepareStatement(lQuery);
    	    	
    			pstmt.setString(1,lemailid );
    			pstmt.setString(2,lpassword);
    			
    			ResultSet rs = pstmt.executeQuery();
    			System.out.println("2");
    			
    			if(rs!=null) {
    				System.out.println("3");
    				Person person = new Person();
        			if(rs.next()){
    				person.setUserName(rs.getString("username"));
    				String Dbpassword=rs.getString("password");
    				 person.setUserPassword(Dbpassword);
    				 person.setUserEmail(rs.getString("emailid"));
    				 person.setUserContact(rs.getString("phoneno"));
    				 if(lpassword.equals(Dbpassword))
    				 {

    	    				RequestDispatcher rd1=request.getRequestDispatcher("voting");
    	    				
    	    				rd1.forward(request, response);
//    	    				
    				 }
        			}
        			
    				 else
    				 {
    					 
   					    PrintWriter out2=response.getWriter();
  						out2.print("<html><body><h1>Username or password is incorrect</h1></body></html>");
   						
 					 
    				 }
    				 
        			request.setAttribute("personObject", person);
       				}
//    				List<Person>list=new ArrayList<Person>();
//    				list.add(person);
    				
    				
    				
    				
//    				HttpSession session= request.getSession();
//    				session.setAttribute("personObject", person);
    				
//    			else if(op1.equals("register1")) {
//    				
//
//    				RequestDispatcher rd1=request.getRequestDispatcher("register");
//    				
//    				rd1.forward(request, response);	
//    				
//    			}
    		  
//     	
//    	while(rs.next()){
//    		
//    		
//    		
//    		person.setUserName(lQuery)
//			
//		String Dbpassword = rs.getString(2);
//		credentials.setDbpassword(Dbpassword);
		
		
	
//				Reque	if(lpassword.equals(Dbpassword))
//			{stDispatcher rd1=request.getRequestDispatcher("voting");
//				rd1.forward(request, response);
				  
            }
		      
            }
    	  
    	
       	
			
			
//		else{
//			out.print("Invalid Credentials");
//		}
		//if(pass.equals("password")==lpassword.equals("lpassword"))
			
		catch (Exception e) {
			e.printStackTrace();
	       
}
//		
//	
//	if(op.equals("register"))
//	{
//		PrintWriter out=response.getWriter();
//		out.print("<html><body><h1> Sorry Username or Password is Incorrect"+"</h1></body></html>");
//		RequestDispatcher rd=request.getRequestDispatcher("registerpage");
//		rd.forward(request, response);
//	}
//	
	}
	

}


