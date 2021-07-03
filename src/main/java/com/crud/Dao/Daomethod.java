package com.crud.Dao;

import java.util.List;

import com.crud.Model.Product;

public interface Daomethod 
{
	public String insert(Product product);
	
	public int update(Product pro);
	
	public String delete(int id);
	
	public List<Product> fetchAll( );
	
	public Product fetchbyid (int id);
}
