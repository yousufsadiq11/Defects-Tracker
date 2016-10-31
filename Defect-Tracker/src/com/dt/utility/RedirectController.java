package com.dt.utility;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RedirectController
 */
public class RedirectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RedirectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String destination = request.getParameter("destination");
		String type = request.getParameter("type");
		RequestDispatcher rd = null;
		if(null != destination){
		if(type.equals(SQLConstants.TYPE_CONTROLLER)){
			rd = request.getRequestDispatcher(destination);
		}else if(type.equals(SQLConstants.TYPE_PAGE)){
			rd = request.getRequestDispatcher(destination+".jsp");
		}
		}else{
			rd = request.getRequestDispatcher("index.jsp");
			request.setAttribute("message", "Sign in to start your session");
		}
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
