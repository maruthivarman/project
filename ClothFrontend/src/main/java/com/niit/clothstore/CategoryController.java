package com.niit.clothstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.model.Category;
import com.niit.model.Product;
import com.niit.service.CategoryDAO;

@Controller
public class CategoryController {
	
	@Autowired 
	private Category category;
	
	@Autowired
	private CategoryDAO categoryDAO;
	

	@RequestMapping("getController")
	public String getController()
	 {
		return "AddCategory";
	 }
	
	@RequestMapping("/newCategory")
	 public ModelAndView newCategory(@ModelAttribute Category category)
	 {
		categoryDAO.insertCategory(category);
		ModelAndView mv = new ModelAndView("AddCategory");
		return mv;
	 }
	
	@RequestMapping("/deletecategory/{id}")
	public String deleteCategory(@PathVariable ("id") int id){
		categoryDAO.deleteCategory(id);
		return "redirect:/viewcategory";
		
	}

	@RequestMapping("viewcategory")
	public ModelAndView viewcategory()
	{
		ModelAndView mv = new ModelAndView("ViewCategory");
		
		return mv;
	}
	@RequestMapping("viewcategorylist")
	public @ResponseBody String viewCategory()
	{
		List<Category> listCategory = categoryDAO.getAllCategory();
		Gson gs= new Gson();
		String result=gs.toJson(listCategory);
		System.out.print(result);
		return result;
	}
	
	
	@RequestMapping(value="editcategory/{id}")
	public ModelAndView editcategory(@PathVariable("id") int id, Model model){
		category = categoryDAO.getCategory(id);
		//model.
		model.addAttribute("category", category);
		return new ModelAndView("EditCategory");
	}

	
	@RequestMapping(value="UpdateCategory", method=RequestMethod.POST)
	 public ModelAndView updateproduct(@ModelAttribute Category category)
	 {
		System.out.println(category.getCategoryid());
		System.out.println(category.getCategoryname());
		System.out.println(category.getDescription());
		categoryDAO.updateCategory(category);
		ModelAndView mv = new ModelAndView("ViewCategory");
		
		//mv.addObject("added successfully",message);
		return mv;
		
	 }

}
