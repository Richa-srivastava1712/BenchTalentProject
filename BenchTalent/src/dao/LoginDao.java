package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.BenchEmployee;


import com.constant.DBConstant;

public class LoginDao {

	Connection connection;
	PreparedStatement ps;
	BenchEmployee prjemp = new BenchEmployee();
	
	/*
	 * The check method in the LoginDao class is responsible for verifying the login credentials provided by the user.
	 * 
	 * */
	public BenchEmployee check(String uname, String pswd){
	try {
		Class.forName(DBConstant.DATABASEDRIVER);
		connection = DriverManager.getConnection(DBConstant.DATABASEURL,DBConstant.DATABASEUSERNAME,DBConstant.DATABASEPASSWORD);
		String loginQuery = "select email, password,sapID, is_WPCSpoc from richadb1.benchemployee where email=? and password =?;";
		

		ps = connection.prepareStatement(loginQuery);
		ps.setString(1,uname);
		ps.setString(2,pswd);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			//retrieves the SAP ID from the db and sets it using setter of BenchEmployee class.
			prjemp.setSapID(rs.getInt(3));
			//retrieves the WPC_SPOC from the db and sets it using setter of BenchEmployee class.
			prjemp.setIs_WPCSpoc(rs.getInt(4));
			//retrieves the Email from the db and sets it using setter of BenchEmployee class.
			prjemp.setEmail(rs.getString(1));
			
			return prjemp;
		}		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
	// no matching record is found for the provided credentials then it return null
	return null;
	}
	}

