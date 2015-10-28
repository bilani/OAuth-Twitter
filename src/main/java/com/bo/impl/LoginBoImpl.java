package com.bo.impl;

import com.bo.LoginBo;
import com.dao.LoginDao;
import com.model.Login;

public class LoginBoImpl implements LoginBo{

	LoginDao loginDao;

	public void setLoginDao(LoginDao loginDao) {
		this.loginDao = loginDao;
	}

	@Override
	public void save(Login login) {
		loginDao.save(login);
		
	}

	@Override
	public void update(Login login) {
		loginDao.update(login);
		
	}

	@Override
	public void delete(Login login) {
		loginDao.delete(login);
		
	}

	@Override
	public Login findUserById(String id) {
		
		return loginDao.findUserById(id);
	}
	
}
