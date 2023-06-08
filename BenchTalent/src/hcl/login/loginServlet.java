package hcl.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.LoginDao;

@WebServlet("/loginServlet")
public class loginServlet extends HttpServlet {
	
    
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String email = request.getParameter("inputEmail");
		String password= request.getParameter("inputPassword");
		String url2 = "index.html";
		LoginDao l = new LoginDao();
		if(l.check(email, password)){
			response.sendRedirect(url2);
		}
		
		
		
		
	}

}
		