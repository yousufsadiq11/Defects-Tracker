package com.dt.addUser;
import com.dt.model.User;
import com.dt.utility.SendMail;

import javax.servlet.http.HttpServletRequest;


public class AddUserBiz {
	 public int AddUser(HttpServletRequest request){
		 User obj=new User();
		 SendMail mail = new SendMail();

		 obj.setEmail(request.getParameter("email"));
		 obj.setPassword("abcd");
		 AddUserDAO dao=new AddUserDAO();
		 int flag=dao.addUser(obj);
		 if(flag==1)
		 {
	     mail.sendMail(request.getParameter("email"));
		 }
		 return flag;
	 }
}
