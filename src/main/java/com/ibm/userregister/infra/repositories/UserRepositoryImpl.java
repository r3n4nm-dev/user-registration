package com.ibm.userregister.infra.repositories;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ibm.userregister.domain.entities.User;
import com.ibm.userregister.domain.repositories.UserRepository;

import reactor.core.publisher.Mono;


public abstract class UserRepositoryImpl implements UserRepository{

	@Autowired
	private  UserRepository userRepository;



	
	
	
}
