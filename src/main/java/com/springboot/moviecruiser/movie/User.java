package com.springboot.moviecruiser.movie;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;


@Entity
@Table(name="user")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="us_id")
	int userId;
	
	@Column(name="us_username")
	String username;
	
	@Column(name="us_password")
	String password;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name = "user_role", 
	joinColumns = @JoinColumn(name = "ur_us_id"),
	inverseJoinColumns = @JoinColumn(name = "ur_ro_id"))
	private Set<Role> roleList;
	
	@ManyToMany(fetch=FetchType.EAGER)
	@JoinTable(name ="favorites",joinColumns = @JoinColumn(name ="user_id",referencedColumnName="us_id"),
	inverseJoinColumns = @JoinColumn(name ="movie_id",referencedColumnName="movie_id"))
	private Set<Movies> favorites;

	public Set<Movies> getFavorites() {
		return favorites;
	}

	public void setFavorites(Set<Movies> favorites) {
		this.favorites = favorites;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Set<Role> getRoleList() {
		return roleList;
	}

	public void setRoleList(Set<Role> roleList) {
		this.roleList = roleList;
	}
//
//	@Override
//	public String toString() {
//		return "User [userId=" + userId + ", username=" + username + ", password=" + password + ", roleList=" + roleList
//				+ "]";
//	}
	
	
}
