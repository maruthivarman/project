package com.niit.clothstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.service.ProductDAO;

@org.springframework.stereotype.Controller
public class Controller {
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDAO productDAO;
	
	@RequestMapping("newproduct")
	 public ModelAndView newProduct(@ModelAttribute Product product)
	 {
		ModelAndView mv = new ModelAndView("ViewProduct");
		productDAO.insertProduct(product);
		//mv.addObject("added successfully",message);
		return mv;
	 }
	@RequestMapping(value="UpdateProduct", method=RequestMethod.POST)
	 public ModelAndView updateproduct(@ModelAttribute Product product)
	 {
		product.setProductid(product.getProductid());
		ModelAndView mv = new ModelAndView("ViewProduct");
		productDAO.updateProduct(product);
		//mv.addObject("added successfully",message);
		return mv;
		
	 }

}
