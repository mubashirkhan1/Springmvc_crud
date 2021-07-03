package com.crud.Dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.crud.Model.Product;



public class Implementation__Dao_product implements Daomethod 
{    
	
	private JdbcTemplate template;   
	
	
  
	
	public JdbcTemplate getTemplate()
	{
		return template;
	}

	public void setTemplate(JdbcTemplate template)
	{
		this.template = template;
	}

	public String insert(Product product) //for insert
	{
		String query="insert into userproduct(id,name,description,price) values(?,?,?,?)";
		this.template.update(query,product.getId(),product.getName(),product.getDescription(),product.getPrice()) ;
		
		return "Success insert";
		
	}

	public 	int update(Product product) //for update,
	{
		
		String sql = "update  userproduct set name=?, description=?, price=? where id=?";
      //String query="update userproduct  set name=?, description=?, price=? where id=?";
      System.out.println(product);
//      String name=product.getName();
//      int price=product.getPrice();
//      int id=product.getId();
//      String desc=product.getDescription();
  	int counter = template.update(sql,
			new Object[] { product.getName(), product.getDescription(), product.getPrice(), product.getId() });
//     String sql= "update userproduct set name="+name+ " ,description="+desc+ " ,price="+price+" where id="+id;
//  	this.template.update(sql,product); 
	return counter;

	}

	public String delete(int id) //for delete
	{
	    String query="delete from userproduct where id=?";
	    this.template.update(query,id);
		return "Success delete";
	}

	public List<Product> fetchAll() //for fetch all
	{
		  String query="select * from userproduct";
		  RowMapper<Product> rawmap= new  Rawmapimpl(); // is it used to covert result set obj into class obj
		 List<Product> product= this.template.query(query, rawmap);
		
		return product;
	}

	public Product fetchbyid(int id)  //for fetch by id
	{

     String query="select * from userproduct where id=?";
    
     RowMapper<Product> rawmap= new  Rawmapimpl();
  
     Product p=this.template.queryForObject(query, rawmap,id);
		return p ;
	}
	
}
