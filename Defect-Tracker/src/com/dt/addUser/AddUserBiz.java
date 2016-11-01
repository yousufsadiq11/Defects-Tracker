package com.dt.addUser;
import com.dt.model.User;
import javax.servlet.http.HttpServletRequest;


public class AddUserBiz {
	 public int AddUser(HttpServletRequest request){
		 User obj=new User();
		 obj.setEmail(request.getParameter("email"));
		
		 AddUserDAO dao=new AddUserDAO();
		 int flag=dao.addUser(obj);
		 return flag;
	 }
}
