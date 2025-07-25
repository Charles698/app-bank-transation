package com.estudo.bankapp.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.estudo.bankapp.entites.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
