package com.crud.handler;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.view.RedirectView;

import com.crud.Dao.Implementation__Dao_product;
import com.crud.Model.Product;

@Controller
public class home_handle 
{ 
	
	@Autowired
	private Implementation__Dao_product daoimple;
	
	@RequestMapping("/home")
	public String home(Model model)
	{	
	 List<Product> product=  this.daoimple.fetchAll();	
		model.addAttribute("product1",product);
		System.out.println("this is home handler");
		return "home";
		
	}
	
	@RequestMapping("/productform")
	public String showproductform(Model model) 
	{
		model.addAttribute("title", "Product App");
		return "Add_product_form";
		
		
	}
	@RequestMapping(value = "/handleproduct", method = RequestMethod.POST)
	public RedirectView handleproduct(@ModelAttribute Product product ,HttpServletRequest req ) 
	{
		System.out.println(product);
		RedirectView rv=new RedirectView(); //insert into dtabase
        rv.setUrl(req.getContextPath()+"/home");
        this.daoimple.insert(product);
		return rv;
	
		
		
	}
	@RequestMapping("/delete/{id}") //this handler is used to delte  product
	public RedirectView deletecon(@PathVariable("id") int id, HttpServletRequest req)
	{  
		this.daoimple.delete(id);
		RedirectView rm=new  RedirectView();
		rm.setUrl(req.getContextPath()+"/home");
		return rm;
	}
	@RequestMapping("/update/{id}")
   public String update(@PathVariable("id") int id ,Model model)
   {
		
    Product product =this.daoimple.fetchbyid(id);
    model.addAttribute("product",product );

	 return "update_form";
   }
	@PostMapping("/updateproduct")
	public RedirectView update(@ModelAttribute Product product, HttpServletRequest req,Model m) {
		RedirectView rm=new RedirectView();
		
		this.daoimple.update(product);
		System.out.println("upadte handler");
		rm.setUrl(req.getContextPath()+"/home");
	
		return rm;
	}
}
