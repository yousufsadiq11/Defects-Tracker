package com.dt.login;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dt.model.User;
import com.dt.userList.IUserListBiz;
import com.dt.userList.UserListBiz;
import com.dt.utility.SQLConstants;


/**
 * Servlet implementation class LoginController
 */
public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//response.sendError(404);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		User user= new User();
		user.setEmail(request.getParameter("email"));
		user.setPassword(request.getParameter("password"));
	    ILoginBiz loginBiz = new LoginBiz();
		
	    RequestDispatcher rd = null;
		if(loginBiz.isValidLogin(user))
	    {
			rd = request.getRequestDispatcher("DashboardController");
			HttpSession session = request.getSession();
			IUserListBiz userListBiz = new UserListBiz();
			String userJson = userListBiz.getUserDetails(user);
			request.setAttribute("userJson", userJson);
			session.setAttribute("userJson", userJson);
	    }
	    else
	    {
	    	
	    	rd = request.getRequestDispatcher("RedirectController?url=index&type="+SQLConstants.TYPE_PAGE);
	    	request.setAttribute("message", "Invalid Login. Please try again");
	    }
		request.setAttribute("user", user);
		rd.forward(request, response);
	}

}