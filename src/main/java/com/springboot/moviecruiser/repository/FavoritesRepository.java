package com.springboot.moviecruiser.repository;

import java.util.Set;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springboot.moviecruiser.movie.Favorites;


@Repository
public interface FavoritesRepository extends JpaRepository<Favorites, Integer>{
	
	Set<Favorites> findByFavUserId(int id); 
	
	void deleteById(int mov_id);
}
