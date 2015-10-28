package com.bo;

import com.model.Login;

public interface  LoginBo {

	void save(Login login);
	void update(Login login);
	void delete(Login login);
	Login findUserById(String id);
}
