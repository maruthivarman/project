package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Product;
@Repository("ProductDAO")
public class ProductDAOImpl implements ProductDAO {


	@Autowired
	private SessionFactory sessionFactory;
	
	 public SessionFactory getSession() {
		return sessionFactory;
	}
	 
	 public ProductDAOImpl(SessionFactory sessionFactory) {
			super();
			this.sessionFactory = sessionFactory;
		}

		public void setSession(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		@Transactional
	public List<Product> getAllProduct() {
			return sessionFactory.getCurrentSession().createQuery("from Product").list();	
	}

	@Transactional
	public Product getProduct(int productid) {
		return (Product)sessionFactory.getCurrentSession().get(Product.class, productid);
	
	}

	@Transactional
	public void insertProduct(Product product) {
		sessionFactory.getCurrentSession().saveOrUpdate(product);


	}
	
	

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteProduct(int id) {
		Product deleteProduct = new Product();
		deleteProduct.setProductid(id);
		sessionFactory.getCurrentSession().delete(deleteProduct);

	}

	@Override
	public void deleteAllProduct(Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}


}
