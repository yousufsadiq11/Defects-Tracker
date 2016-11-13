package com.dt.addUser;

/**
 * @author Anurag
 *
 */
import java.io.IOException;

import javax.servlet.RequestDispatcher;
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
		AddUserBiz obj=new AddUserBiz();
		int flag=obj.AddUser(request);
		RequestDispatcher rd = request.getRequestDispatcher("DefectListController");
		if(flag==1){
			request.setAttribute("message", "User successfully added in the system and notification has been sent to regsitered email id.");
		}
		else
		{
			request.setAttribute("message", "User Already Exist");
		}
		rd.forward(request, response);
		
	}


}

