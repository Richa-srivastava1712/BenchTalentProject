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

import com.constant.DBConstant;

@WebServlet("/DeleteProjectServlet")
public class DeleteProjectServlet extends HttpServlet {
	
	Connection connection;
	PreparedStatement ps;
	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
			// Deleting project using Project ID and then redirecting to main home page i.e. index.html
						    
				try {
					Class.forName(DBConstant.DATABASEDRIVER);  
					connection = DriverManager.getConnection(DBConstant.DATABASEURL,DBConstant.DATABASEUSERNAME,DBConstant.DATABASEPASSWORD);
					String  delete_Project_Query = " 	 DELETE from richadb1.project"
							+ "  WHERE projectID = ?";
					ps= connection.prepareStatement(delete_Project_Query);
					System.out.println(request.getParameter("inputProjectID"));
					int prjID = Integer.parseInt(request.getParameter("inputProjectID"));
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
				String url2 = "index.html";
				response.sendRedirect(url2);
			
			
			
			
	}

}
