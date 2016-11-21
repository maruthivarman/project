package com.niit.clothstore;

import java.util.List;

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

import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.service.CategoryDAO;
import com.niit.service.ProductDAO;
import com.niit.service.SupplierDAO;

@org.springframework.stereotype.Controller
//@RequestMapping("/admin")
public class Controller {
	
	@Autowired
	Product product;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private SupplierDAO supplierDAO;
	

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
		List<Category> categoryList = categoryDAO.getAllCategory();
		List<Supplier> supplierList = supplierDAO.getAllSuppliers();
		product = productDAO.getProduct(id);
		
		model.addAttribute("product", product);
		ModelAndView mv=new ModelAndView("EditProduct");
		mv.addObject("categoryList", categoryList);
		mv.addObject("supplierList", supplierList);

		return mv;
	}

	
	@RequestMapping(value="UpdateProduct", method=RequestMethod.POST)
	 public ModelAndView updateproduct(@ModelAttribute Product product)
	 {
		System.out.println(product.getProductid());
		productDAO.updateProduct(product);
		ModelAndView mv = new ModelAndView("ViewProduct");
		
		//mv.addObject("added successfully",message);
		return mv;
		
	 }

}
