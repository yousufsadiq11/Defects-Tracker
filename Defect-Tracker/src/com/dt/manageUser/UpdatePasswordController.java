package com.dt.manageUser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class UpdateUserController
 */
public class UpdatePasswordController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdatePasswordController() {
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
		HttpSession session = request.getSession();
		String responseMessage = manageUserBiz.updatePassword(user);
		RequestDispatcher rd = null;
		rd = request.getRequestDispatcher("RedirectController?url=updatePassword&type=PAGE");
		session.setAttribute("userJson", user);
		request.setAttribute("userJson", user);
		request.setAttribute("message", responseMessage);
		rd.forward(request, response);
	}

}
