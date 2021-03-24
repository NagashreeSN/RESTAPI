//package com.springboot.moviecruiser.movie;
//
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import org.springframework.jdbc.core.RowMapper;
//import org.springframework.stereotype.Component;
//
//@Component
//public class MovieMapper implements RowMapper<Movies>{
//
//	@Override
//	public Movies mapRow(ResultSet res, int rowNum) throws SQLException {
//		Movies movie=new Movies();
//		
//		movie.setMovieId(res.getInt(1));
//		movie.setTitle(res.getString(2));
//		movie.setBoxOffice(res.getBigDecimal(3)); 
//		boolean isActive=res.getString(4).equals("yes")?true:false;
//		movie.setActive(isActive); 
//		movie.setDateOfLaunch(res.getDate(5));
//		movie.setGenre(res.getString(6));
//		boolean hasTeaser=res.getString(7).equals("yes")?true:false;
//		movie.setHasTeaser(hasTeaser);
//		return movie;
//	}
//}
