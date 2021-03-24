package com.springboot.moviecruiser.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.authentication.www.BasicAuthenticationFilter;



@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter{
	

	@Autowired
	AppUserDetailsService userDetailsService;
	
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.userDetailsService(userDetailsService).passwordEncoder(getPasswordEncoder());
		}

	@Bean
	public PasswordEncoder getPasswordEncoder() {
		
		return new BCryptPasswordEncoder();
		
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http
		.csrf().disable()
		.authorizeRequests()
		.antMatchers("/customerMovieList")
		.hasRole("USER")
		.antMatchers("/deleteFavorites/**")
		.hasRole("USER")
		.antMatchers("/viewFavorites")
		.hasRole("USER")
		.antMatchers("/addToFavorites")
		.hasRole("USER")
		.antMatchers("/adminMovieList")
		.hasRole("ADMIN");
		//http.formLogin();
		//http.addFilter(new BasicAuthenticationFilter(authenticationManager()));
		http.addFilter(new JWTAuthFilter(authenticationManager()));
	}
	
//	@Override
//	protected void configure(HttpSecurity http) throws Exception {
//		http.authorizeRequests()
//		.antMatchers("/adminMovieList").hasRole("admin")
//		.antMatchers("/customerMovieList").hasRole("user")
//		.and()
//		.formLogin().successHandler(myAuthenticationSuccessHandler())
//		.and()
//		.logout()
//		.logoutRequestMatcher(new AntPathRequestMatcher("/logout"))
//		.logoutSuccessUrl("/login");
//	
//	}
//
//	@Bean
//	protected AuthenticationSuccessHandler myAuthenticationSuccessHandler() {
//		return new UrlSuccessHandler();
//	}
	
}
