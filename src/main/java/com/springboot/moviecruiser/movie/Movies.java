package com.springboot.moviecruiser.movie;

import java.math.BigInteger;
import java.util.Date;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="movie")
public class Movies {

	@Id
	@Column(name="movie_id")
	int movieId;
	
	@Column(name="mtitle")
	String title;
	
	@Column(name="box_office")
	java.math.BigInteger boxOffice;
	
	@Column(name="active_status")
	boolean active;
	
	@Column(name="date_of_launch")
	Date dateOfLaunch;
	
	@Column(name="genre")
	String genre;
	
	@Column(name="has_teaser")
	boolean hasTeaser;
	
	@ManyToMany(mappedBy="favorites")
	Set<User> userList;

//	@OneToOne(mappedBy="movies")
//	private Favorites favorites;
//	
//	public Favorites getFavorite() {
//		return favorites;
//	}
//	public void setFavorite(Favorites favorite) {
//		this.favorites = favorite;
//	}
	public int getMovieId() {
		return movieId;
	}
	public void setMovieId(int movieId) {
		this.movieId = movieId;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public java.math.BigInteger getBoxOffice() {
		return boxOffice;
	}
	public void setBoxOffice(java.math.BigInteger boxOffice) {
		this.boxOffice = boxOffice;
	}
	public boolean isActive() {
		return active;
	}
	public void setActive(boolean active) {
		this.active = active;
	}
	public Date getDateOfLaunch() {
		return dateOfLaunch;
	}
	public void setDateOfLaunch(Date dateOfLaunch) {
		this.dateOfLaunch = dateOfLaunch;
	}
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public boolean isHasTeaser() {
		return hasTeaser;
	}
	public void setHasTeaser(boolean hasTeaser) {
		this.hasTeaser = hasTeaser;
	}
	
	public Movies() {
		
	}
	public Movies(int movieId, String title, BigInteger boxOffice, boolean active, Date dateOfLaunch, String genre,
			boolean hasTeaser) {
		super();
		this.movieId = movieId;
		this.title = title;
		this.boxOffice = boxOffice;
		this.active = active;
		this.dateOfLaunch = dateOfLaunch;
		this.genre = genre;
		this.hasTeaser = hasTeaser;
	}
	
	
}
