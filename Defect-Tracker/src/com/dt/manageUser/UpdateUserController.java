package com.dt.manageUser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dt.model.User;
import com.google.gson.Gson;

/**
 * Servlet implementation class UpdateUserController
 */
public class UpdateUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateUserController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendError(404);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String user = request.getParameter("user");
		IManageUserBiz manageUserBiz = new ManageUserBiz();
		String responseMessage = manageUserBiz.updateUserDetails(user);
		User obj = new User();
		Gson gson = new Gson(); 
		obj = gson.fromJson(user,User.class);
		RequestDispatcher rd = null;
		if(obj.getRole().equals("ADMIN")){
		rd = request.getRequestDispatcher("UserListController");
		}else{
		rd = request.getRequestDispatcher("RedirectController?url=userProfileController&type=CONTROLLER");
		}
		request.setAttribute("message", responseMessage);
		rd.forward(request, response);
	}

}
