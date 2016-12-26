package com.niit.clothstore;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.model.Product;
import com.niit.service.ProductDAO;

@Controller
public class IndexController {

	@Autowired
	private Product product;
	
	@Autowired
	private ProductDAO productDAO;
	
	
	@RequestMapping("/")
	public ModelAndView gethomepage(){
		
		ModelAndView mv = new ModelAndView("index");
		List <Product> listProduct = productDAO.getAllProducts();
		
		mv.addObject("listProduct", listProduct);
		//mv.addObject("ProductList", true);
		return mv;
	}
	@RequestMapping("home")
	public String gethome(){
	return "redirect:/";
	
	}

}
