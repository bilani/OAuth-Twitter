package com.dao;

import com.model.Login;

public interface LoginDao {
	void save(Login login);
	void update(Login login);
	void delete(Login login);
	Login findUserById(String id);
}
