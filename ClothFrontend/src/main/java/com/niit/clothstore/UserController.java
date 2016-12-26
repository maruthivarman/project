package com.niit.clothstore;

import java.security.Principal;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.web.authentication.logout.SecurityContextLogoutHandler;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Product;
import com.niit.model.Role;
import com.niit.model.User;
import com.niit.service.ProductDAO;
import com.niit.service.RoleDAO;
import com.niit.service.UserDAO;

@Controller
public class UserController {

	@Autowired
	private User user;
	
	@Autowired
	private Role role;
	@Autowired
	private RoleDAO roleDAO;
	
	@Autowired
	private UserDAO userDAO;

	@Autowired
	private ProductDAO productDAO;
	
	@RequestMapping("/getlogin") 
	public String getlogin(@RequestParam(value = "error", required = false) String error,
			@RequestParam(value = "logout", required = false) String logout, Model model) {
		//System.out.println("inside get login");
		if (error != null) {
			model.addAttribute("error", "Invalid Username and Password");  
		  }

		  if (logout != null) {
			  model.addAttribute("logout", "Logged out successfully");
			  
		  }
		return "login";
	}

	
	
	@RequestMapping("getsignup")
	public ModelAndView getsignup() {
		ModelAndView mv = new ModelAndView("signup");
		
		
		return mv;
	}

	@RequestMapping("newUser")
	public ModelAndView newUser(@ModelAttribute User user, @RequestParam("password") String password, @RequestParam("username") String username){
	/*public ModelAndView newUser(@RequestParam("username") String username,@RequestParam("emailid") String emailid, @RequestParam("password") String password,
			@RequestParam("mobile_number") long mobile_number, @RequestParam("gender") String gender,
			@RequestParam("address") String address) {
		user.setUsername(username);
		user.setPassword(password);
		user.setEmailid(emailid);
		user.setMobile_number(mobile_number);
		user.setAddress(address);
		user.setGender(gender);*/
		String message = null;
		role.setRole("ROLE_USER");
	
		role.setEnabled(true);
	role.setRoleid(user.getUserid());
		role.setPassword(password);
		role.setUsername(username);
		user.setRole(role);
		role.setUser(user);
		userDAO.insertUser(user);
		roleDAO.insertRole(role);
		ModelAndView mv = new ModelAndView("login");
		mv.addObject("Registered successfully", message);
		return mv;
	}
	
	/*@RequestMapping(value = "/afterlogin")
	public ModelAndView afterlogin(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout, Model model, Principal principal ) {

	
		String name = principal.getName();
		
		
		ModelAndView model1 = new ModelAndView();
		if (error != null) {
			model1.addObject("error", "Invalid Credentials provided.");
		}

		if (logout != null) {
			model1.addObject("message", "Logged out successfully.");
		}

	  
	  System.out.println("inside security");
	  List <Product> listProduct = productDAO.getAllProducts();
	  model.addAttribute("listProduct", listProduct);
	  model.addAttribute("name", name);
	  return new ModelAndView("index");

	}
*/	
	@RequestMapping(value="logout", method = RequestMethod.GET)
	public String logoutPage (HttpServletRequest request, HttpServletResponse response) {
	    Authentication auth = SecurityContextHolder.getContext().getAuthentication();
	    if (auth != null){    
	        new SecurityContextLogoutHandler().logout(request, response, auth);
	    }
	    return "redirect:/getlogin?logout";
	}
	
	@RequestMapping(value = "/afterlogin")
	public String login(Principal p, Model model, Principal principal) {
		String message= null;
		String name = principal.getName();
		
		Role role =roleDAO.getRole(p.getName());
		System.out.println(role.getRole());
		if(role.getRole().equals("ROLE_USER")){
			 message ="redirect:/user";
		}
		else{
			message = "redirect:/admin";
		}

	System.out.println("inside security");
	 List <Product> listProduct = productDAO.getAllProducts();
	  model.addAttribute("listProduct", listProduct);
	  model.addAttribute("name", name);
	  return message;

	}
	
}
