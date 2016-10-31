package com.niit.clothstore;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.service.ProductDAO;

@org.springframework.stereotype.Controller
//@RequestMapping("/admin")
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
	@RequestMapping(value="editproduct/{id}")
	public ModelAndView editproduct(@PathVariable("id") int id, Model model){
		product = productDAO.getProduct(id);
		//model.
		//model.addAttribute("product", product);
		return new ModelAndView("AddProduct");
	}

	
	@RequestMapping(value="UpdateProduct", method=RequestMethod.POST)
	 public ModelAndView updateproduct(@Valid @ModelAttribute("product") Product product)
	 {

		ModelAndView mv = new ModelAndView("ViewProduct");
		productDAO.updateProduct(product);
		//mv.addObject("added successfully",message);
		return mv;
		
	 }

}
