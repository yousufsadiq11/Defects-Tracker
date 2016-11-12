package com.dt.updateDefect;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class UpdateDefectController extends HttpServlet {
	private static final long serialVersionUID = 1L;
    
    public UpdateDefectController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	//	UpdateDefectBiz obj=new UpdateDefectBiz();
		String selectedDefect = request.getParameter("defect");
		request.setAttribute("selectedDefect", selectedDefect);
		RequestDispatcher rd = request.getRequestDispatcher("updateDefect.jsp");
		rd.forward(request, response);
	/*	PrintWriter out = response.getWriter();
		int flag=obj.updateDefect(request);
		if(flag==1)
		{
			out.println("Defect updated successfully");
		}
		doGet(request, response);*/
	}

}
