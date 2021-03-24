package com.springboot.moviecruiser.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.springboot.moviecruiser.movie.Movies;
import com.springboot.moviecruiser.movie.User;
import com.springboot.moviecruiser.repository.MovieRepository;
import com.springboot.moviecruiser.repository.UserRepository;



@Service
public class UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	MovieRepository movieRepository;
	
	public User getUserByName(String name) {
		
		return userRepository.findByUsername(name);
		
	}
	
	public User getUserById(int id) {
		
		return userRepository.findByUserId(id);
		
	}
	
	public Movies removeFavorites(int id) {
		
		User user = userRepository.findByUserId(1);
	
		Set<Movies> favorites = user.getFavorites();
		Movies movie = movieRepository.findById(id).get();
		favorites.remove(movie);
		user.setFavorites(favorites);
		userRepository.save(user);
		
		return movie;
		
	}
	
	public Movies addToFavorites(Movies movie) {

		User user = userRepository.findByUserId(1);
		Set<Movies> favorites = user.getFavorites();
		
		favorites.add(movie);
		user.setFavorites(favorites);
		userRepository.save(user);
		
		return movie;

	}

}
