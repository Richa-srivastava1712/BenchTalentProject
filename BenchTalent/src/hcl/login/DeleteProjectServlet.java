package hcl.login;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import dao.DeleteProjectDao;

@SuppressWarnings("serial")
@WebServlet("/DeleteProjectServlet")
public class DeleteProjectServlet extends HttpServlet {

	
		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			int projectID =Integer.parseInt(request.getParameter("inputProjectID"));
			DeleteProjectDao deletePrj = new DeleteProjectDao();
			deletePrj.deleteProject(projectID);
				String url2 = "index.jsp";
				response.sendRedirect(url2);

	}

}
