package com.qsp.LoginPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.List;
import java.util.ListIterator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.servlet.jsp.tagext.TryCatchFinally;

import org.apache.jasper.tagplugins.jstl.core.Out;

import com.qsp.model.Person;

public class Voting extends HttpServlet {

	// char[] Dbpassword = null;

	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException
	{
		String op2=request.getParameter("btn4");
		
		PrintWriter out1=response.getWriter();
		out1.print("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"ISO-8859-1\">\r\n"
				+ "<title>VOTING</title>\r\n"
				+ "\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "<form action=\"voting\" method=\"post\">\r\n"
				+ "\r\n"
				+ "\r\n"
				+ "CANDIDATE 1<input type=\"submit\"  value=\"c1\" name=\"btn4\"><br><br>\r\n"
				+ " \r\n"
				+ "CANDIDATE 2<input type=\"submit\" value=\"c2\" name=\"btn4\"><br><br>\r\n"
				+ "\r\n"
				+ "CANDIDATE 3<input type=\"submit\" value=\"c3\" name=\"btn4\"><br><br>\r\n"
				+ "\r\n"
				+ "CANDIDATE 4<input type=\"submit\" value=\"c4\" name=\"btn4\"><br><br> \r\n"
				+ "</form>\r\n"
				+ "</body>\r\n"
				+ "</html>");
//		HttpSession votingSession=request.getSession();
		         
		
	//	System.out.println(Dbpassword);
//		query = "Update set votingStatus="value" from  where 
		String voterName;
		String output;
		
//    	System.out.println(emailId);
      
//		boolean b=false;
		// try {
			 
			 Person person=(Person)request.getAttribute("personObject");
			
				
			
		 if(person!=null)
		 {
			 System.out.println("op2");
			//String emailId=person.getUserEmail(); 
			//System.out.println("Person object in Voting class: " + person);
		 
		 }
			 
		   
				 if(op2.equals("c1"))
					{
			    System.out.println("Ala baba op2 madhi");
			    PrintWriter out=response.getWriter();
			    out.print("Voted Successfully");
		    	//voterName="candidate1";
  			// output= updateVoterDetailsInPersonObject(voterName,emailId);
			
				
							
					}

		   }
	
}

			 
			 
			 
			
//				
		  
		 
	
	
		// }
//	catch (Exception e) {
//		e.printStackTrace();
//	} 






		 
		 
		

		 


	

		
//		if(op2.equals("candidate2"))
//		{
//			voterName ="candidate2";
//			output= updateVoterDetailsInPersonObject(voterName,emailId);
//		}
//		
//		if(op2.equals("candidate3"))
//		{
////			voterName ="candidate3";
////			output= updateVoterDetailsInPersonObject(voterName,emailId);
//		}
//		
//		if(op2.equals("candidate4"))
//		{
//			voterName ="candidate4";
//			output= updateVoterDetailsInPersonObject(voterName,emailId);
//		}
//		
//		
//		
		
	//}
	
//public String updateVoterDetailsInPersonObject(String voterName, String emailID) {
//		
//		String qry="UPDATE LOGIN.LOGINTABLE SET vote=? WHERE emailid=?";
//		String outputResult="";
//		try {
//		Class.forName("com.mysql.jdbc.Driver");
//		Connection con= DriverManager.getConnection("jdbc:mysql://localhost:3306?user=root&password=Siddhesh@123");
//		PreparedStatement pstmt=con.prepareStatement(qry);
//		pstmt.setString(1,voterName);
//		pstmt.setString(2, emailID);
//		
//		int recordUpdated = pstmt.executeUpdate();
//		//System.out.println("5");
//		
//		if(recordUpdated >0) {
//			outputResult="Voting recorded successfully";
//		}else{
//			outputResult="Please try after some time";
//		}
//		
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
//		System.out.println("ambadnya");
//		return outputResult;
//		
//	}
//
//}
//
