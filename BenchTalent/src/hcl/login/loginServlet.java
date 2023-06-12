package hcl.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.BenchEmployee;
import dao.LoginDao;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	
	LoginDao l = new LoginDao();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("inputEmail");
		String password= request.getParameter("inputPassword");
		
		// Validating users credentials entered by users
		BenchEmployee be =  l.check(email, password);
		
		if(be != null ){
			int sapID =be.getSapID();
			Integer is_admin = be.getIs_WPCSpoc();
			
			//Creating Session to set Attribute 
			HttpSession session =request.getSession();
			session.setAttribute("useremail", email);
			session.setAttribute("sapId", sapID);
			session.setAttribute("is_WPC_SPOC", is_admin);
			
			//Checking user is admin/WPC_SPOC or bench Talent user
			if(is_admin.equals(0)){
				
				// If  user is not WPC SPOC, they will be redirected to user page where he/she can view, selct and submit project
				response.sendRedirect("benchtalentindex.jsp");}
			else{
				
				// If  user is WPC SPOC, they will be redirected to admin page where he/she can add, delete project
				response.sendRedirect("index.jsp");
			}
		
		// If user crendentials is not correct , he/She will be redirected to login page itself.
		}else{
			response.sendRedirect("login.jsp");
		}
		
		
		
		
		
	}

}
		