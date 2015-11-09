package com.model;

import org.springframework.data.repository.CrudRepository;

public interface LoginDao extends CrudRepository<login, Long>{
	
public login findByUserName(String userName);

}
