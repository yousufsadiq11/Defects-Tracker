package com.dt.addDefect;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddDefectController
 */
public class AddDefectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDefectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendError(500);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		AddDefectBiz obj=new AddDefectBiz();
		int flag=obj.AddDefect(request);
		RequestDispatcher rd = request.getRequestDispatcher("DefectListController");
		if(flag==1){
			request.setAttribute("message", "New defect created.");
		}
		else{
			request.setAttribute("message", "Some error occurred. Please try again.");
		}
		rd.forward(request, response);
	}

}
