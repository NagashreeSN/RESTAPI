package com.springboot.moviecruiser.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springboot.moviecruiser.movie.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUsername(String name);
	
	User findByUserId(int id);
}
