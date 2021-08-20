package com.ibm.userregister.presentation.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.userregister.domain.entities.User;
import com.ibm.userregister.domain.repositories.UserRepository;

import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/")
public class UserController {


	@Autowired 
	private UserRepository userRepository;

	
	
	@PostMapping
	public Mono<User> register(@RequestBody User user) {

		return this.userRepository.save(user);
	}
	
	

}
