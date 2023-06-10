package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.constant.DBConstant;

public class LoginDao {

	Connection connection;
	PreparedStatement ps;
	
	public boolean check(String uname, String pswd){
	try {
		Class.forName(DBConstant.DATABASEDRIVER);
		connection = DriverManager.getConnection(DBConstant.DATABASEURL,DBConstant.DATABASEUSERNAME,DBConstant.DATABASEPASSWORD);
		//connection = DriverManager.getConnection(DBConstant.DATABASEURL,DBConstant.DATABASEUSERNAME,DBConstant.DATABASEPASSWORD);
		String loginQuery = "select email, password from richadb1.benchemployee where email=? and password =?";

		ps = connection.prepareStatement(loginQuery);
		ps.setString(1,uname);
		ps.setString(2,pswd);
		ResultSet rs = ps.executeQuery();
		if(rs.next()){
			return true;
		}
		
	} catch (ClassNotFoundException | SQLException e) {
		e.printStackTrace();
	}
		return false;
	}
}
