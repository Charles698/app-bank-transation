package com.estudo.bankapp.config;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Configuration;

import com.estudo.bankapp.entites.User;
import com.estudo.bankapp.repositories.UserRepository;

@Configuration
public class BankappConfig implements CommandLineRunner {
	
	@Autowired
	private UserRepository userRepository;
	
	@Override
	public void run(String... args) throws Exception {
		User u1 = new User(null, "Charles Felipe", "charles@gmail.com", 1427, "328.749.660-85");
		User u2 = new User(null, "Henrique Santos", "henrique@gmail.com", 5319, "750.422.983-42");
		
		userRepository.saveAll(Arrays.asList(u1, u2));
	}
	
}
