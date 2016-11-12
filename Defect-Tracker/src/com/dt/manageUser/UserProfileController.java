package com.dt.manageUser;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dt.referenceData.GetReferenceDataBiz;
import com.dt.referenceData.IGetReferenceDataBiz;
import com.dt.utility.SQLConstants;

/**
 * Servlet implementation class UserProfileController
 */
public class UserProfileController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserProfileController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IGetReferenceDataBiz getReferenceDataBiz = new GetReferenceDataBiz();
		String listOfModules = getReferenceDataBiz.getModuleList();
		String listOfRoles = getReferenceDataBiz.getRoleList();
		HttpSession session = request.getSession();
		String selectedUser = session.getAttribute("userJson").toString();
		RequestDispatcher rd = request.getRequestDispatcher("RedirectController?url=userProfile&type="+SQLConstants.TYPE_PAGE);
		request.setAttribute("listOfModules", listOfModules);
		request.setAttribute("listOfRoles", listOfRoles);
		request.setAttribute("selectedUser", selectedUser);
		rd.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
