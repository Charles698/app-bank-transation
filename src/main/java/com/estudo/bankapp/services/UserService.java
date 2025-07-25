package com.estudo.bankapp.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.estudo.bankapp.entites.User;
import com.estudo.bankapp.repositories.UserRepository;

@Service
public class UserService {
	
	@Autowired
	private UserRepository repository;
	
	@GetMapping
	public List<User> findAll(){
		return repository.findAll();
	}
	
}
