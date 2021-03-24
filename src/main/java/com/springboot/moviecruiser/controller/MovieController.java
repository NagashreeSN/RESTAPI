package com.springboot.moviecruiser.controller;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.core.Authentication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;

import com.springboot.moviecruiser.movie.Favorites;
import com.springboot.moviecruiser.movie.Movies;
import com.springboot.moviecruiser.movie.User;
import com.springboot.moviecruiser.service.FavoriteService;
import com.springboot.moviecruiser.service.MovieService;
import com.springboot.moviecruiser.service.UserService;

import io.jsonwebtoken.JwtBuilder;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import java.util.Base64;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@RestController
@CrossOrigin(origins="*")
@SessionAttributes("username")
public class MovieController {

	
	private static final Logger LOGGER = LoggerFactory.getLogger(MovieService.class);
	
	@Autowired
	MovieService movieService;
	
	@Autowired
	UserService userService;

	
	@Autowired
	FavoriteService favoriteService;
	
	@CrossOrigin
	@RequestMapping(value="/moviesAngular")
	@ResponseBody
	public List<Movies> getMovies(ModelMap model){
		List<Movies> list=movieService.getAllMovies();
		model.put("list", list);
		return list;
	}
	
	
	@RequestMapping("/adminMovieList")
	public List<Movies> viewMoviesAdmin(ModelMap model) {

		List<Movies> adminMovieList = new ArrayList<>();
		adminMovieList = movieService.getAllMovies();
		model.put("movieList", adminMovieList);
		return adminMovieList;

	}
	
	@RequestMapping(value="/viewFavorites",method = RequestMethod.GET)
	@ResponseBody
	public List<Movies> viewFavorites(){
		User user = userService.getUserById(1);
		Set<Movies> movie=user.getFavorites();
		List<Movies> favorites=new ArrayList<Movies>();
		for(Movies m:movie) {
			favorites.add(m);
		}
		return favorites;
	}
	
	
	@DeleteMapping("/deleteFavorites/{movieId}")
	public ResponseEntity<Movies> removeFavorite(@PathVariable int movieId){
		Movies movie=userService.removeFavorites(movieId);
		return new ResponseEntity<Movies>(movie,HttpStatus.OK);
	}

	@PostMapping(value = "/addToFavorites")
	public ResponseEntity<Movies> addToFavorites(@RequestBody String id){
		
		
		Movies movie = movieService.findById(Integer.parseInt(id));
		userService.addToFavorites(movie);		
		return new ResponseEntity<Movies>(movie, HttpStatus.OK);
		
	}

	@PutMapping("/editMovie/{movieId}")
	public ResponseEntity<Movies> update(@PathVariable int movieId, @RequestBody Movies movie){
		
		Movies result = movieService.updateMovie(movie);
		return new ResponseEntity<Movies>(result, HttpStatus.OK);
	}
	

	@RequestMapping(value = "/logout")
	public String ReturnToLogin(HttpServletRequest request, SessionStatus status) {
		HttpSession session = request.getSession(false);
		status.setComplete();
		session.invalidate();
		return "redirect:/login";
	}	

	
	@GetMapping("/authenticate")
	@ResponseBody
	private Map<String, String>  getToken(@RequestHeader("Authorization") String authHeader) {
		Map<String, String> m = new HashMap<>();
		
		String user = getUser(authHeader);
		String token = generateJwt(user);
		m.put("token", token );
		return m;
		
	}
	
	private String getUser(String authHeader) {
		String baseStr = authHeader.substring(authHeader.indexOf("Basic ")+6);
		byte[] encCred = Base64.getDecoder().decode(baseStr);
		String encStr = new String(encCred);
		return encStr.substring(0, encStr.indexOf(":"));
		
	}
	
	private String generateJwt(String user) {
		  JwtBuilder builder = Jwts.builder(); 
		 builder.setSubject(user); 
		 
		// Set the token issue time as current time 
		builder.setIssuedAt(new Date()); 
		 // Set the token expiry as 20 minutes from now 
		 builder.setExpiration(new Date((new Date()).getTime() + 1200000)); 
		 builder.signWith(SignatureAlgorithm.HS256, "ABC123"); 
		 
		 String token = builder.compact(); 
		 
		 return token; 
		}

}
