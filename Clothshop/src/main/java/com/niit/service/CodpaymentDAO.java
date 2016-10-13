package com.niit.service;

import java.util.List;

import com.niit.model.Codpayment;

public interface CodpaymentDAO {
	public List<Codpayment> getAllCodpayments();
	 public Codpayment getCodpayment(int codpaymentid);
	 public void insertCodpayment(Codpayment codpayment);
	 public void updateCodpayment(Codpayment codpayment);
	 public void deleteCodpayment(int id);
	 public void deleteAllCodpayment(Codpayment codpayment);
}
