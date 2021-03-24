package com.springboot.moviecruiser.service;

import java.util.Set;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.moviecruiser.movie.Favorites;
import com.springboot.moviecruiser.repository.FavoritesRepository;


@Service
public class FavoriteService {

	@Autowired
	FavoritesRepository favoritesRepository;
	
		@Transactional
		public Set<Favorites> getFavorites(int id){
		
			return favoritesRepository.findByFavUserId(id);
		}
		
		@Transactional
		public void addToFavorites(Favorites favorite) {
			
			favoritesRepository.save(favorite);	
		}
		
		@Transactional
		public void deleteFavorites(int movieid) {
			
			favoritesRepository.deleteById(movieid);
			
		}
		
}
