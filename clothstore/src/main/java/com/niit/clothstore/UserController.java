package com.niit.clothstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Role;
import com.niit.model.User;
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
	
	
	@RequestMapping("/getlogin") 
	public String getlogin() {
		//System.out.println("inside get login");
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
		role.setRole("ROLE_USER");
		role.setUser(user);
		role.setEnabled(true);
		role.setRoleid(10);
		role.setPassword(password);
		role.setUsername(username);
		user.setRole(role);
		userDAO.insertUser(user);
		//roleDAO.insertRole(role);
		ModelAndView mv = new ModelAndView("login");
		return mv;
	}
	
	@RequestMapping(value = "/afterlogin")
	public ModelAndView login(@RequestParam(value = "error", required = false) String error,
		@RequestParam(value = "logout", required = false) String logout) {

	  /*ModelAndView model = new ModelAndView();
	  if (error != null) {
		model.addObject("error", "Invalid username and password!");
	  }

	  if (logout != null) {
		model.addObject("msg", "You've been logged out successfully.");
	  }
	  model.setViewName("login");*/
	  System.out.println("inside security");
	  return new ModelAndView("index1");

	}
	
	@RequestMapping("getindex1")
	public ModelAndView getindex1() {
		ModelAndView mv = new ModelAndView("index1");
		return mv;
	}

	
}
