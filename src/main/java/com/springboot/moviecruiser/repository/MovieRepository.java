package com.springboot.moviecruiser.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.springboot.moviecruiser.movie.Movies;

@Repository
public interface MovieRepository  extends JpaRepository<Movies, Integer>{

	@Query(value="FROM Movies")
	List<Movies> getAllMovies();
	
	List<Movies> findByActive(boolean value);
	
	Movies findByTitle(String Movietitle);
}
