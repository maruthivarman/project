package com.niit.clothstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.model.Supplier;
import com.niit.service.CategoryDAO;
import com.niit.service.ProductDAO;
import com.niit.service.SupplierDAO;
@Controller
public class ProductController {
	
	@Autowired
	private Product product;
	
	@Autowired
	private ProductDAO productDAO;
	
	@Autowired
	private CategoryDAO categoryDAO;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
@RequestMapping("/getproduct")
 public ModelAndView  getproduct()
 {
	List<Category> categoryList = categoryDAO.getAllCategory();
	List<Supplier> supplierList = supplierDAO.getAllSuppliers();
	
	ModelAndView mv=new ModelAndView("AddProduct");
	mv.addObject("categoryList", categoryList);
	mv.addObject("supplierList", supplierList);

	return mv;
 }
@RequestMapping("/getproduct/{id}")
public ModelAndView editproduct(@PathVariable("id") int id)
{
	product = productDAO.getProduct(id);
	ModelAndView mv=new ModelAndView("AddProduct");
	mv.addObject("product", product);
	return mv;
}

@RequestMapping("/deleteproduct/{id}")
public String deleteProduct(@PathVariable ("id") int id){
	productDAO.deleteProduct(id);
	return "redirect:/viewproduct";
	
}
@RequestMapping("viewproduct")
public ModelAndView viewproduct()
{
	ModelAndView mv = new ModelAndView("ViewProduct");
	
	return mv;
}
@RequestMapping("viewproductlist")
public @ResponseBody String viewproducts()
{
	List<Product> listProduct = productDAO.getAllProducts();
	Gson gs= new Gson();
	String result=gs.toJson(listProduct);
	System.out.print(result);
	return result;
}




}
