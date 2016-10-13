package com.niit.service;

import java.util.List;

import com.niit.model.Cardpayment;

public interface CardpaymentDAO {
	public List<Cardpayment> getAllCardpayments();
	 public Cardpayment getCardpayment(int cardpaymentid);
	 public void insertCardpayment(Cardpayment cardpayment);
	 public void updateCardpayment(Cardpayment cardpayment);
	 public void deleteCardpayment(int id);
	 public void deleteAllCardpayment(Cardpayment cardpayment);
}
