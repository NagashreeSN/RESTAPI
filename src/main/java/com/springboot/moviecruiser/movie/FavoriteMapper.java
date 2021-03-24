package com.springboot.moviecruiser.movie;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

@Component
public class FavoriteMapper implements RowMapper<Integer>{

	@Override
	public Integer mapRow(ResultSet res, int rowNum) throws SQLException {
		int result = res.getInt(1);
		return result;
	}

}
