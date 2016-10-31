package com.niit.clothstore;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.google.gson.Gson;
import com.niit.model.Supplier;
import com.niit.service.SupplierDAO;
@Controller
public class SupplierController {
	
	@Autowired
	private Supplier supplier;
	
	@Autowired
	private SupplierDAO supplierDAO;
	
	
@RequestMapping("/getsupplier")
 public String getsupplier()
 {
	return "AddSupplier";
 }

@RequestMapping("newSupplier")
 public ModelAndView newSupplier(@ModelAttribute Supplier supplier)
 {
	supplierDAO.insertSupplier(supplier);
	ModelAndView mv = new ModelAndView("AddSupplier");
	return mv;
 }

@RequestMapping("/deletesupplier/{id}")
public String deleteSupplier(@PathVariable ("id") int id){
	supplierDAO.deleteSupplier(id);
	return "redirect:/viewsupplier";
	
}

@RequestMapping("viewsupplier")
public ModelAndView viewsupplier()
{
	ModelAndView mv = new ModelAndView("ViewSupplier");
	
	return mv;
}
@RequestMapping("viewsupplierlist")
public @ResponseBody String viewsuppliers()
{
	List<Supplier> listSupplier = supplierDAO.getAllSuppliers();
	Gson gs= new Gson();
	String result=gs.toJson(listSupplier);
	System.out.print(result);
	return result;
}


}
