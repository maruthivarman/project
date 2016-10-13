package com.niit.service;

import java.util.List;

import com.niit.model.Shippingdetails;

public interface ShippingdetailsDAO {
	public List<Shippingdetails> getAllShipppingdetailss();
	 public Shippingdetails getShipppingdetails(int shippingdetailsid);
	 public void insertShippingdetails(Shippingdetails shippingdetails);
	 public void updateShippingdetails(Shippingdetails shippingdetails);
	 public void deleteShippingdetails(int id);
	 public void deleteAllShippingdetails(Shippingdetails shippingdetails);
}
