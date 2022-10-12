package com.qsp.LoginPage;


import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;



public class RegisterDetails extends HttpServlet{
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException ,IOException
	{
		String username=request.getParameter("uname");
		String password=request.getParameter("upass") ;
		
		String emailid=request.getParameter("uemail") ;
		
		String phoneno=request.getParameter("uphoneno") ;
		
		
		String op=request.getParameter("btn");
		
		String qry="insert into login.logintable values(?,?,?,?,?)";
		
		try {
			if(op.equals("register"))
			{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Siddhesh@123");
			PreparedStatement pstmt=con.prepareStatement(qry);
			pstmt.setString(1,username );
			pstmt.setString(2,password);
			pstmt.setString(3,emailid);
			pstmt.setString(4,phoneno);
			pstmt.setString(5,"");
			
			pstmt.executeUpdate();
			PrintWriter out=response.getWriter();
			
			out.print("Your Details Are Saved Succesfully");
			
			RequestDispatcher rd=request.getRequestDispatcher("login");
		    rd.forward(request, response);
		    
    
//		    if()
//		    System.out.println("");
//		       if(rs.next())
//		    {
//		    	   PrintWriter out2=response.getWriter();
//			out2.print("password is"+rs.getString(2));
//			
//			}
//			String str1=rs.getString(2);
//			String str2=rs.getString(1);

			
			
			
			
//		HttpSession session=request.getSession();
//		session.setAttribute("uemail", emailid);
//       session.setAttribute("upass", password);
       
		}
			else if(op.equals("login"))
			{
				PrintWriter out1=response.getWriter();
				
				out1.print("<html><body><h1>Please Register Your Details First</h1></body></html>");
				RequestDispatcher rd=request.getRequestDispatcher("register.html");
			    rd.include(request, response);
			}
		
		}
	  catch (Exception e) {
		 e.printStackTrace();
	  }
		}
	}



