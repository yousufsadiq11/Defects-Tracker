package com.dt.addUser;

/**
 * @author Anurag
 *
 */
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


/**
 * Servlet implementation class AssignRoleController
 */
public class AddUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		AddUserBiz obj=new AddUserBiz();
		int flag=obj.AddUser(request);
		if(flag==1){
		out.println("User successfully added in the system and notification has been sent to regsitered email id.");
		out.println("<a href=RedirectController?destination=dashboard&type=PAGE>Go Back to Dashboard</a>");
		}
		else
		{
			out.println("User Already Exist");
			out.println("<a href=RedirectController?destination=dashboard&type=PAGE>Go Back to Dashboard</a>");
		}
		
	//	doGet(request, response);
	
	}


}

