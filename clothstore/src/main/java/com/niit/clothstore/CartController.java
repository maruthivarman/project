package com.niit.clothstore;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.servlet.ModelAndView;

import com.niit.model.Cart;
import com.niit.model.Product;
import com.niit.service.CartDAO;
import com.niit.service.ProductDAO;

@Controller
public class CartController {
	@Autowired
	private Cart cart;
	
	@Autowired
	private CartDAO cartDAO;
	
	@Autowired
	ProductDAO productDAO;
	
	@Autowired
	Product product;

	@RequestMapping("/order/{username}")
	public String placeorder(@PathVariable("username") String username){
		
		return "redirect:/checkout?username="+username;
		
	}
	@RequestMapping("viewcart")
	public ModelAndView viewcart(Principal p){
		String username = p.getName();
		ModelAndView mv = new ModelAndView("Cart");
		mv.addObject("username", username);
		return mv;
		
	}
	@RequestMapping("/refreshcart/{username}")
	public @ResponseBody List<Cart> refreshCartItem(@PathVariable("username") String username){
		
		return cartDAO.getCart(username);
	}
	
	@RequestMapping(value="/addtocart/{itemId}" , method = RequestMethod.PUT)
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void addtocart(@PathVariable("itemId") int itemId,Principal pr){
		Product p = productDAO.getProduct(itemId);
		cart.setUsername(pr.getName());
		cart.setProductid(p.getProductid());
		cart.setProductname(p.getProductname());
		cart.setPrice(p.getPrice());
		cart.setQuantity(1);
		System.out.println("inside insert cartController");
		cartDAO.insertCart(cart);
	}
	@RequestMapping(value="/removeItemFromCart/{cartid}")
	@ResponseStatus(value = HttpStatus.NO_CONTENT)
	public void removeItemFromCart(@PathVariable("cartid") int cartid){
		cartDAO.deleteCart(cartid);
	}
	
}
