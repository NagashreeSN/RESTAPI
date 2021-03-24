package com.springboot.moviecruiser.service;

import java.util.List;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.moviecruiser.movie.Movies;
import com.springboot.moviecruiser.repository.MovieRepository;

@Service
public class MovieService {
	

	@Autowired
	MovieRepository movieRepository;
	
	@Transactional
	public List<Movies> getAllMovies(){
		return movieRepository.getAllMovies();	
	}
	
	@Transactional
	public List<Movies> findAllCustomerMovies(){
		return movieRepository.findByActive(true);	
	}
	
	@Transactional
	public void saveMovie(Movies movie) {
		movieRepository.save(movie);	
	}
	
	@Transactional
	public Movies getMoviesByName(String title) {
		return movieRepository.findByTitle(title);
	}

	@Transactional
	public Movies findById(int id) {	
		return movieRepository.findById(id).get();
	}
	
	public Movies updateMovie(Movies movie) {

		Movies editResult = movieRepository.findById(movie.getMovieId()).get();

		editResult.setTitle(movie.getTitle());
		editResult.setGenre(movie.getGenre());
		editResult.setBoxOffice(movie.getBoxOffice());

		movieRepository.save(editResult);

		return editResult;

	}
}
