//package hcl.dao;
//
//import java.sql.*;
//
//import connections.Project;
//
//
//public class AddProject {
//	//project pro = new project();
//	
//	public static void addProject() {
//			
//	try {
//	Class.forName("com.mysql.cj.jdbc.Driver");  
//    Connection connection;
//	
//	connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/richadb1","root","123456");
//	
//    									
//    String insert_addproject_query = "INSERT INTO richadb1.project"+
//    		    								" (projectID, reqNo, Joining_Level_4, Initiator "
//    		    								+ ",Pending_With, Primary_Skills, Secondary_Skills, Customer, "
//    		    								+ "Band, Sub_Band, Designation, Experience, Job_Family, "
//    		    								+ "Job,Job_Description, Country, Personal_Area, "
//    		    								+ "Personal_SubArea) VALUES " +
//    		    								" (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?);";
//    //project proj= new project(874, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query, insert_addproject_query);
//    
//    Project pro = new Project();
//   PreparedStatement ps= connection.prepareStatement(insert_addproject_query);
//   ps.setInt(1, 874);
//   System.out.println("Req Number in AddProject.java "+ pro.getReqNo());
//   ps.setString(2, "pro.getReqNo()" );
//   ps.setString(3, pro.getJoining_Level_4() );
//   ps.setString(4, pro.getInitiator());
//   ps.setString(5, pro.getPending_With());
//   ps.setString(6, pro.getPrimary_Skills());
//   ps.setString(7, pro.getSecondary_Skill());
//   ps.setString(8, pro.getCustomer() );
//   ps.setString(9, pro.getBand() );
//   ps.setString(10, pro.getSub_band() );
//   ps.setString(11,pro.getDesignation() );
//   ps.setString(12, pro.getExperience());
//   ps.setString(13, pro.getJob_Family() );
//   ps.setString(14, pro.getJob());
//   ps.setString(15, pro.getJob_Description() );
//   ps.setString(16, pro.getCountry() );
//   ps.setString(17, pro.getPersonal_Area());
//   ps.setString(18, pro.getPersonal_SubArea());
// 
//   
////   ps.setInt(1, 874);
////   ps.setString(2, "reqno" );
////   ps.setString(3, "pro.getJoining_Level_4()" );
////   ps.setString(4, "pro.getInitiator()");
////   ps.setString(5, "pro.getPending_With()");
////   ps.setString(6, "pro.getPrimary_Skills()");
////   ps.setString(7, "pro.getSecondary_Skill()");
////   ps.setString(8, "pro.getCustomer()" );
////   ps.setString(9, "pro.getBand()" );
////   ps.setString(10, "pro.getSub_band()" );
////   ps.setString(11,"pro.getDesignation()" );
////   ps.setString(12, "pro.getExperience()");
////   ps.setString(13, "pro.getJob_Family()" );
////   ps.setString(14, "pro.getJob()");
////   ps.setString(15, "pro.getJob_Description()" );
////   ps.setString(16, "pro.getCountry()" );
////   ps.setString(17, "pro.getPersonal_Area()");
////   ps.setString(18, "pro.getPersonal_SubArea()");
//   
//  int count =ps.executeUpdate();
//  System.out.println("Number of Rows affected : "+count);
//  
//  ps.close();
//  connection.close();
//	
//	} catch (SQLException | ClassNotFoundException e) {
//		
//		e.printStackTrace();
//	} 
//}
//
//	
//}