package com.niit.clothstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.model.Category;
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
	
	@RequestMapping("newCategory")
	 public ModelAndView newCategory(@ModelAttribute Category category)
	 {
		categoryDAO.insertCategory(category);
		ModelAndView mv = new ModelAndView("AddCategory");
		return mv;
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

}
