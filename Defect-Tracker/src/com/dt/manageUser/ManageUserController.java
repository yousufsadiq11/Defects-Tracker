package com.dt.manageUser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dt.referenceData.GetReferenceDataBiz;
import com.dt.referenceData.IGetReferenceDataBiz;

/**
 * Servlet implementation class ManageUserController
 */
public class ManageUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ManageUserController() {
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
		IGetReferenceDataBiz getReferenceDataBiz = new GetReferenceDataBiz();
		String listOfModules = getReferenceDataBiz.getModuleList();
		String listOfRoles = getReferenceDataBiz.getRoleList();
		String selectedUser = request.getParameter("user");
		RequestDispatcher rd = request.getRequestDispatcher("manageUser.jsp");
		request.setAttribute("listOfModules", listOfModules);
		request.setAttribute("listOfRoles", listOfRoles);
		request.setAttribute("selectedUser", selectedUser);
		rd.forward(request, response);
		
	}

}
