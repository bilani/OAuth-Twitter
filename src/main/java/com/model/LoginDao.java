package com.model;

import org.springframework.data.repository.CrudRepository;

public interface LoginDao extends CrudRepository<login, Long>{
	
public login findByIdlogin(long id);

}
