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
		
		return "/checkout?username"+username;
		
	}
	@RequestMapping("viewcart")
	public String viewcart(){
		return "Cart";
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
		cart.setPrice(p.getPrice());
		cart.setQuantity(1);
		System.out.println("inside insert cartController");
		cartDAO.insertCart(cart);
	}
	
}
