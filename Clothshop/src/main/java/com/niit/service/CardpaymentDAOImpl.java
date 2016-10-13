package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Cardpayment;
@Repository("CardpaymentDAO")
public class CardpaymentDAOImpl implements CardpaymentDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	 public SessionFactory getSession() {
		return sessionFactory;
	}

	public CardpaymentDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void setSession(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Cardpayment> getAllCardpayments()
	 {
		
			return sessionFactory.getCurrentSession().createQuery("from Cardpayment").list();	
	}
	@Transactional
	public Cardpayment getCardpayment(int cardpaymentid) {
		return (Cardpayment)sessionFactory.getCurrentSession().get(Cardpayment.class, cardpaymentid);
	}
	@Transactional
	public void insertCardpayment(Cardpayment cardpayment) {
		sessionFactory.getCurrentSession().saveOrUpdate(cardpayment);
	}
	@Transactional
	public void updateCardpayment(Cardpayment cardpayment) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void deleteCardpayment(int id) {
		Cardpayment deleteCardpayment = new Cardpayment();
		deleteCardpayment.setCardpaymentid(id);
		sessionFactory.getCurrentSession().delete(deleteCardpayment);
		
	}
	@Transactional
	public void deleteAllCardpayment(Cardpayment cardpayment) {
		// TODO Auto-generated method stub
		
	}


}
