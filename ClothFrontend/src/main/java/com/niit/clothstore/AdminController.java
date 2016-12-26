package com.niit.clothstore;

import java.security.Principal;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.niit.service.ProductDAO;
import com.niit.service.SupplierDAO;

@Controller
@RequestMapping("/admin")
public class AdminController {

	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	SupplierDAO supplierDAO;

	@RequestMapping
	public ModelAndView getadmin(Principal p){
		String name=p.getName();
		ModelAndView mv = new ModelAndView("AdminHome");
		mv.addObject("name", name);
		return mv;
	}
}
