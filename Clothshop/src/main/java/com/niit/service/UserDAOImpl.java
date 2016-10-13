package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.User;
@Repository("UserDAO")
public class UserDAOImpl implements UserDAO {
	
	@Autowired
	private SessionFactory sessionFactory;
	
	 public SessionFactory getSession() {
		return sessionFactory;
	}

	public UserDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void setSession(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<User> getAllUsers()
	 {
		
			return sessionFactory.getCurrentSession().createQuery("from User").list();	
	}
	@Transactional
	public User getUser(int userid) {
		return (User)sessionFactory.getCurrentSession().get(User.class, userid);
	}
	@Transactional
	public void insertUser(User user) {
		sessionFactory.getCurrentSession().saveOrUpdate(user);
	}
	@Transactional
	public void updateUser(User user) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void deleteUser(int id) {
		User deleteUser = new User();
		deleteUser.setUserid(id);
		sessionFactory.getCurrentSession().delete(deleteUser);
		
	}
	@Transactional
	public void deleteAllUser(User user) {
		// TODO Auto-generated method stub
		
	}

}
