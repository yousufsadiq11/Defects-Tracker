package com.dt.login;

import com.dt.model.User;

public class LoginBiz implements ILoginBiz {

	@Override
	public Boolean isValidLogin(User user) {
		
		ILoginDAO loginDAO = new LoginDAO();
		return loginDAO.login(user);
	}

}
