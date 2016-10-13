package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Category;


@Repository("CategoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	 public SessionFactory getSession() {
		return sessionFactory;
	}
	 
	 public CategoryDAOImpl(SessionFactory sessionFactory) {
			super();
			this.sessionFactory = sessionFactory;
		}

		public void setSession(SessionFactory sessionFactory) {
			this.sessionFactory = sessionFactory;
		}

		@Transactional
	public List<Category> getAllCategory() {
			return sessionFactory.getCurrentSession().createQuery("from Category").list();	
	}

	@Transactional
	public Category getCategory(int categoryid) {
		return (Category)sessionFactory.getCurrentSession().get(Category.class, categoryid);
	
	}

	@Transactional
	public void insertCategory(Category category) {
		sessionFactory.getCurrentSession().saveOrUpdate(category);


	}
	
	

	@Override
	public void updateCategory(Category category) {
		// TODO Auto-generated method stub

	}

	@Override
	public void deleteCategory(int id) {
		Category deleteCategory = new Category();
		deleteCategory.setcategoryid(id);
		sessionFactory.getCurrentSession().delete(deleteCategory);

	}

	@Override
	public void deleteAllCategory(Category category) {
		// TODO Auto-generated method stub

	}

	
	}


