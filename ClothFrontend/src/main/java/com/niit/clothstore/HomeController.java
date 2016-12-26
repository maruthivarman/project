package com.niit.clothstore;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.service.ProductDAO;

@Controller
@RequestMapping("/user")
public class HomeController {

	@Autowired
	Product product;
	
	@Autowired
	ProductDAO productDAO;
	
	
	@RequestMapping
	public ModelAndView getuserhome(Principal p){
		String name=p.getName();
		List<Product> listProduct = productDAO.getAllProducts();
		ModelAndView mv = new ModelAndView("index");
		mv.addObject("listProduct", listProduct);
		mv.addObject("name", name);
		return mv;
	}
	@RequestMapping("/ProductDesc/{id}")
	public ModelAndView viewproduct(Principal p,@PathVariable("id") int pid){
		ModelAndView mv = new ModelAndView("ProductDesc");
		Product product = productDAO.getProduct(pid);
		mv.addObject("p", product);
		return mv;
	}
}
