package com.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import com.doman.login;


public interface LoginRepository extends CrudRepository<login, Integer>{
	
	/*Page<login> findAll(Pageable pageable);*/

}
