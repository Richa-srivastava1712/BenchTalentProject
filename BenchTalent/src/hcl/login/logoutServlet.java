package hcl.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/logoutServlet")
public class logoutServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//HttpSession session = request.getSession();
		HttpSession session = request.getSession(false); // Retrieve the current session without creating a new one

        if (session != null) {
            session.invalidate(); // Invalidate and destroy the session
        }

        response.sendRedirect("login.jsp"); // Redirect the user to the login page
   
	}

}
