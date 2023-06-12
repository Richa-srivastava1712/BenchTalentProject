package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.constant.DBConstant;

public class SendProjectToSpocDao {

	Connection connection;
	PreparedStatement ps;
	 ResultSet resultSet;
	
	public void sendProjectToSpoc(int projectID, int empID){
		try {
			Class.forName(DBConstant.DATABASEDRIVER);
			connection = DriverManager.getConnection(DBConstant.DATABASEURL,DBConstant.DATABASEUSERNAME,DBConstant.DATABASEPASSWORD);
			
			 // Check if the project with the same project ID and employee ID already exists
	        String checkQuery = "SELECT * FROM project_benchemp WHERE projectID = ? AND empID = ?";
	        PreparedStatement checkPs = connection.prepareStatement(checkQuery);
	        checkPs.setInt(1, projectID);
	        checkPs.setInt(2, empID);
	        resultSet = checkPs.executeQuery();
	        
	        if (resultSet.next()) {
	            // A record with the same project ID and employee ID already exists
	            System.out.println("Record already exists for projectID: " + projectID + " and empID: " + empID);
	        } 
	        else{
			String projectsTospoc ="INSERT INTO project_benchemp (projectID, empID) VALUES (?, ?);";
			ps= connection.prepareStatement(projectsTospoc);			  
			   ps.setInt(1, projectID );
			   ps.setInt(2, empID );
			   ps.executeUpdate();
			   
	        }
		} catch (ClassNotFoundException | SQLException e) {
			
			e.printStackTrace();
		}		
	}
}
