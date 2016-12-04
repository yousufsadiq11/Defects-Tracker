package com.dt.assignLead;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class assignDefectController
 */
public class assignLeadController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public assignLeadController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String assigned_to=request.getParameter("assigned_to");
		int id=Integer.parseInt(request.getParameter("hidden"));
		assignLeadBiz defectListBiz=new assignLeadBiz();
		boolean flag=defectListBiz.assignDefectBiz(assigned_to,id);
		

		System.out.println("hidden"+id);
		String listofDefect = defectListBiz.getDefectList();
		String listofDefects = defectListBiz.getDefectList();
		
		if(flag==true){
			
		listofDefects = defectListBiz.getDefectList();
			request.setAttribute("message", "Defect Assigned Successfully");}
		else{request.setAttribute("message", "Defect Assignment Failed");}
		RequestDispatcher rd = request.getRequestDispatcher("assignDefect.jsp");
		System.out.println("list"+listofDefects);
		
		 request.setAttribute("listOfDefects", listofDefects);
		 request.setAttribute("message", "Defect Assigned Successfully");
		 out.print("listOfDefects");
	rd.forward(request, response);
	}

}
