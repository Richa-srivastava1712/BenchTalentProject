package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.constant.DBConstant;

public class DeleteProjectDao {
	Connection connection;
	PreparedStatement ps;
	
	public void deleteProject(int prjID){
	try {
		Class.forName(DBConstant.DATABASEDRIVER);  
		connection = DriverManager.getConnection(DBConstant.DATABASEURL,DBConstant.DATABASEUSERNAME,DBConstant.DATABASEPASSWORD);
		String  delete_Project_Query = " 	 DELETE from richadb1.project"
				+ "  WHERE projectID = ?";
		ps= connection.prepareStatement(delete_Project_Query);
		//System.out.println(request.getParameter("inputProjectID"));
		//int prjID = Integer.parseInt(request.getParameter("inputProjectID"));
		ps.setInt(1, prjID);
		ps.executeUpdate();
	    			
		
	} catch (SQLException | ClassNotFoundException e) {
		e.printStackTrace();
	}finally{
		try {
			ps.close();
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	}
}
