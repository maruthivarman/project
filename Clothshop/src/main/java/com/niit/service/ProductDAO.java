package com.niit.service;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO {
	public List<Product> getAllProducts();
	 public Product getProduct(int productid);
	 public void insertProduct(Product product);
	 public void updateProduct(Product product);
	 public void deleteProduct(int id);
	 public void deleteAllProduct(Product product);
}
