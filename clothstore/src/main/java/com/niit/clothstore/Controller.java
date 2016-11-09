package com.niit.clothstore;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;
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
	

@RequestMapping(value="newproduct" , method=RequestMethod.POST)
 public ModelAndView newProduct(@ModelAttribute Product product,@RequestParam("file") MultipartFile file)
 {
	
	
	productDAO.insertProduct(product);
	String path = "C://Users/welcome/workspace/clothstore/src/main/webapp/WEB-INF/resources/ProductImage/";
	FileUtil.upload(path, file, product.getProductid()+".jpg");

	ModelAndView mv = new ModelAndView("AddProduct");
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
