package com.niit.service;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.niit.model.Codpayment;

@Repository("CodpaymentDAO")
public class CodpaymentDAOImpl implements CodpaymentDAO {
	@Autowired
	private SessionFactory sessionFactory;
	
	 public SessionFactory getSession() {
		return sessionFactory;
	}

	public CodpaymentDAOImpl(SessionFactory sessionFactory) {
		super();
		this.sessionFactory = sessionFactory;
	}

	public void setSession(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}
	
	@Transactional
	public List<Codpayment> getAllCodpayments()
	 {
		
			return sessionFactory.getCurrentSession().createQuery("from Codpayment").list();	
	}
	@Transactional
	public Codpayment getCodpayment(int codpaymentid) {
		return (Codpayment)sessionFactory.getCurrentSession().get(Codpayment.class, codpaymentid);
	}
	@Transactional
	public void insertCodpayment(Codpayment codpayment) {
		sessionFactory.getCurrentSession().saveOrUpdate(codpayment);
	}
	@Transactional
	public void updateCodpayment(Codpayment codpayment) {
		// TODO Auto-generated method stub
		
	}
	@Transactional
	public void deleteCodpayment(int id) {
		Codpayment deleteCodpayment = new Codpayment();
		deleteCodpayment.setCodpaymentid(id);
		sessionFactory.getCurrentSession().delete(deleteCodpayment);
		
	}
	@Transactional
	public void deleteAllCodpayment(Codpayment codpayment) {
		// TODO Auto-generated method stub
		
	}

}
