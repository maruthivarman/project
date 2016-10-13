package com.niit.service;

import java.util.List;

import com.niit.model.Cart;

public interface CartDAO {
	public List<Cart> getAllCarts();
	 public Cart getCart(int cartid);
	 public void insertCart(Cart cart);
	 public void updateCart(Cart cart);
	 public void deleteCart(int id);
	 public void deleteAllCart(Cart cart);
}
