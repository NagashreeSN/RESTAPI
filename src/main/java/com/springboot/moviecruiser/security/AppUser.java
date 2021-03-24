package com.springboot.moviecruiser.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Set;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import com.springboot.moviecruiser.movie.Role;
import com.springboot.moviecruiser.movie.User;


public class AppUser implements UserDetails {

	private static final long serialVersionUID = 1L;

	private User user;
	private List<SimpleGrantedAuthority> authorities;
	// private Collection<? extends GrantedAuthority> authorities;

	

	public AppUser(User user) {

		this.user = user;
		Set<Role> roles = user.getRoleList();
		this.authorities = new ArrayList<>();

		for (Role role : roles) {

			authorities.add(new SimpleGrantedAuthority(role.getRoleName()));

		}	
	}

	@Override
	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	@Override
	public String getPassword() {
		return user.getPassword();
	}

	@Override
	public String getUsername() {
		return user.getUsername();
	}

	@Override
	public boolean isAccountNonExpired() {
		return true;
	}

	@Override
	public boolean isAccountNonLocked() {
		return true;
	}

	@Override
	public boolean isCredentialsNonExpired() {
		return true;
	}

	@Override
	public boolean isEnabled() {
		return true;
	}

}
