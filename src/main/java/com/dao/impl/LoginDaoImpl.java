package com.dao.impl;

import java.util.List;

import org.springframework.orm.hibernate3.support.HibernateDaoSupport;

import com.dao.LoginDao;
import com.model.Login;

public class LoginDaoImpl extends HibernateDaoSupport implements LoginDao{

	@Override
	public void save(Login login) {
		getHibernateTemplate().save(login);
		
	}

	@Override
	public void update(Login login) {
		getHibernateTemplate().update(login);
		
	}

	@Override
	public void delete(Login login) {
		getHibernateTemplate().delete(login);
		
	}

	@Override
	public Login findUserById(String id) {
		List list = getHibernateTemplate().find(
                "from login where idlogin=?",id
          );
	return (Login)list.get(0);
	}

}
