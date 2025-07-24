package com.estudo.bankapp.resources;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.estudo.bankapp.entites.User;

@RestController
@RequestMapping(value = "/users")
public class UserResource {
	
	@GetMapping
	public ResponseEntity<User> findUser(){
		User u1 = new User(null, "Charles Felipe", "charles@gmail.com", 1427, "398.028.764-92");
		return ResponseEntity.ok().body(u1);
	}
}
