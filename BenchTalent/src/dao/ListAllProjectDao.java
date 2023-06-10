	package dao;
	
	import java.sql.Connection;
	import java.sql.DriverManager;
	import java.sql.PreparedStatement;
	import java.sql.ResultSet;
	import java.sql.SQLException;
	import java.util.ArrayList;
	import java.util.List;
	
	import model.Project;
	
	import com.constant.DBConstant;
	
	public class ListAllProjectDao {
	
		Connection connection;
		PreparedStatement ps;
		List<Project> projects;
		public List<Project> selectAllUsers() {
		try {
			 projects= new ArrayList<>();
			Class.forName(DBConstant.DATABASEDRIVER);
			connection = DriverManager.getConnection(DBConstant.DATABASEURL,DBConstant.DATABASEUSERNAME,DBConstant.DATABASEPASSWORD);
			String listAllProject ="select * from richadb1.project;";
			ps = connection.prepareStatement(listAllProject);
			ResultSet rs = ps.executeQuery();
			while(rs.next()){
				Project pr = new Project();
				pr.setProjectID(rs.getInt(1));
				pr.setReqNo(rs.getString(2));
				pr.setJoining_Level_4(rs.getString(3));
				pr.setInitiator(rs.getString(4));
				pr.setPending_With(rs.getString(5));
				pr.setPrimary_Skills(rs.getString(6));
				pr.setSecondary_Skill(rs.getString(7));
				pr.setCustomer(rs.getString(8));
				pr.setBand(rs.getString(9));
				pr.setSub_band(rs.getString(10));
				pr.setDesignation(rs.getString(11));
				pr.setExperience(rs.getString(12));
				pr.setJob_Family(rs.getString(13));
				pr.setJob(rs.getString(14));
				pr.setJob_Description(rs.getString(15));
				pr.setCountry(rs.getString(16));
				pr.setPersonal_Area(rs.getString(17));
				pr.setPersonal_SubArea(rs.getString(18));
				projects.add(pr);
			}
			
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return projects;
	   }
	}
