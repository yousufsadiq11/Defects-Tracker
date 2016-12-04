package com.dt.defectList;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dt.model.User;
import com.google.gson.Gson;

/**
 * Servlet implementation class AssignRoleController
 */
public class DefectListController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DefectListController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		String userJson = session.getAttribute("userJson").toString();
		User obj = new User();
		Gson gson = new Gson(); 
		obj = gson.fromJson(userJson,User.class);
		IDefectListBiz defectListBiz = new DefectListBiz();
		String listofDefects = defectListBiz.getDefectList(obj);
		
		RequestDispatcher rd = request.getRequestDispatcher("RedirectController?url=dashboard&type=PAGE");
		request.setAttribute("listOfDefects", listofDefects);
		rd.forward(request, response);
	}

}
