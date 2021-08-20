package com.ibm.userregister.domain.repositories;


import org.springframework.data.mongodb.repository.ReactiveMongoRepository;

import com.ibm.userregister.domain.entities.User;

import reactor.core.publisher.Mono;

public interface UserRepository extends ReactiveMongoRepository<User, String>{
	
	//Mono<User> saveOrUpdate(User user);
	//Mono<User> findById(String id);
}
