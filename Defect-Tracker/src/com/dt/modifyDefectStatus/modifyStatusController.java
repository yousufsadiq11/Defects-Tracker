package com.dt.modifyDefectStatus;

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
public class modifyStatusController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter out = response.getWriter();
		String defect_status=request.getParameter("status");
		System.out.println("statusssssssssssssssssssss"+defect_status);
		int id=Integer.parseInt(request.getParameter("hidden"));
		modifyDefectStatusBiz defectListBiz=new modifyDefectStatusBiz();
		boolean flag=defectListBiz.assignDefectBiz(defect_status,id);
		

		System.out.println("hidden"+id);
		String listofDefect = defectListBiz.getDefectList();
		String listofDefects = defectListBiz.getDefectList();
		
		if(flag==true){
			
		listofDefects = defectListBiz.getDefectList();
		    request.setAttribute("id", id);
		    request.setAttribute("lead", defect_status);
			request.setAttribute("message", "Has Been Successfully Updated To");}
		else{request.setAttribute("message", "updation Failed");
		}
		RequestDispatcher rd = request.getRequestDispatcher("defectsList.jsp");
		System.out.println("list"+listofDefects);
		 request.setAttribute("id", id);
		 request.setAttribute("lead", defect_status);
		 request.setAttribute("listOfDefects", listofDefects);
		 request.setAttribute("message", "Has Been Successfully Updated To");
		 out.print("listOfDefects");
	rd.forward(request, response);	}

}
