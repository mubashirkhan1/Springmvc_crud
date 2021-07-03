package com.crud.Dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.crud.Model.Product;

public class Rawmapimpl implements RowMapper<Product>{

	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
	Product p=new Product();
	p.setId(rs.getInt(1));
	p.setName(rs.getString(2));
	p.setDescription(rs.getString(3));
	p.setPrice(rs.getInt(4));
	
	
	return p;
		
	}

}
