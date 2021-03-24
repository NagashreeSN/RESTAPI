package com.springboot.moviecruiser.movie;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "favorites")
public class Favorites {

	@Id
	@Column(name = "fav_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@Column(name = "user_id")
	private int favUserId;
	
	@Column(name = "movie_id")
	private int favMovieId;
	
//	@OneToOne
//	@JoinColumn(name = "movie_id")
//	private Movies movies;
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getFavUserId() {
		return favUserId;
	}

	public void setFavUserId(int favUserId) {
		this.favUserId = favUserId;
	}

	public int getFavMovieId() {
		return favMovieId;
	}

	public void setFavMovieId(int favMovieId) {
		this.favMovieId = favMovieId;
	}

//	public Movies getMovie() {
//		return movies;
//	}
//
//	public void setMovie(Movies movie) {
//		this.movies = movie;
//	}

//
//	@Override
//	public String toString() {
//		return "Favorites [id=" + id + ", favUserId=" + favUserId + ", favMovieId=" + favMovieId + "]";
//	}
	
	
	
}
