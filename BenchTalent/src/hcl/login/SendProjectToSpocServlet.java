package hcl.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.SendProjectToSpocDao;

@SuppressWarnings("serial")
@WebServlet("/SendProjectToSpocServlet")
public class SendProjectToSpocServlet extends HttpServlet {

	SendProjectToSpocDao sp = new SendProjectToSpocDao();
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String[] selectedProjects = request.getParameterValues("selectedProjects");
		HttpSession session = request.getSession();
		int empID= (int) session.getAttribute("sapId");
		//int empID = 123;
		//System.out.println(empID);
		int selectedProjectId = 0;
		if (selectedProjects != null) {
			
		    for (String projectId : selectedProjects) {
		    	projectId = projectId.trim();
		    	if(projectId.matches("\\d+")){
		        selectedProjectId = Integer.parseInt(projectId);
		        sp.sendProjectToSpoc(selectedProjectId, empID);
		    	}else{
		    		System.out.println("Invalid projectID: "+projectId );
		    	}
		    }		
	    }

   }
}
