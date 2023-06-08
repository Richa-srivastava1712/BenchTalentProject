package hcl.login;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AddProjectServlet")
public class AddProjectServlet extends HttpServlet {
	
	Connection connection;
	PreparedStatement ps;
	
	int projectID = 100 + (int) (Math.random()*899);
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			
		try {
		Class.forName("com.mysql.cj.jdbc.Driver");  
	    
		connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/richadb1","root","123456");
	    									
	    String insert_addproject_query = "INSERT INTO richadb1.project"+
	    		    								" (projectID, reqNo, Joining_Level_4, Initiator "
	    		    								+ ",Pending_With, Primary_Skills, Secondary_Skills, Customer, "
	    		    								+ "Band, Sub_Band, Designation, Experience, Job_Family, "
	    		    								+ "Job,Job_Description, Country, Personal_Area, "
	    		    								+ "Personal_SubArea) VALUES " +
	    		    								" (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
	    
	   ps= connection.prepareStatement(insert_addproject_query);
	   ps.setInt(1, projectID);
	   ps.setString(2, request.getParameter("inputReqNumber") );
	   ps.setString(3, request.getParameter("inputJoiningLevel") );
	   ps.setString(4, request.getParameter("inputInitiatorName"));
	   ps.setString(5, request.getParameter("inputPendingWith"));
	   ps.setString(6, request.getParameter("inputPrimarySkill"));
	   ps.setString(7, request.getParameter("inputSecondarySkill"));
	   ps.setString(8, request.getParameter("inputCustomer") );
	   ps.setString(9, request.getParameter("inputBand") );
	   ps.setString(10, request.getParameter("inputSubBand") );
	   ps.setString(11, request.getParameter("inputDesignation") );
	   ps.setString(12, request.getParameter("inputExperience") );
	   ps.setString(13, request.getParameter("inputJobFamily") );
	   ps.setString(14, request.getParameter("inputJob"));
	   ps.setString(15, request.getParameter("inputJobDescription") );
	   ps.setString(16, request.getParameter("inputCountry") );
	   ps.setString(17, request.getParameter("inputPersonalArea"));
	   ps.setString(18, request.getParameter("inputPeronalSubarea"));
	 
	   
	  int count =ps.executeUpdate();
	  System.out.println("Number of Rows affected : "+count);
	  
	 
		
		} catch (SQLException | ClassNotFoundException e) {
			
			e.printStackTrace();
		} 
		finally{
			try {
				 ps.close();
				connection.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		
		response.sendRedirect("index.html");
	}	
}


