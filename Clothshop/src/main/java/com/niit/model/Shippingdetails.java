	package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="shippingdetails")
@Component
public class Shippingdetails {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userid;
	@Column
private int productid;
	@Column
private String address;
	@Column
private int deliverydate;
	@Column
private String status;
	@Column
private int amount;
	
public int getUserid()
{
 return userid;
}
public void setUserid(int userid)
{
	this.userid=userid;
}
public int getProductid()
{
 return productid;
}
public void setProductid(int productid)
{
	this.productid=productid;
}
public String getAddress()
{
 return address;
}
public void setAddress(String address)
{
	this.address=address;
}
public int getDeliverydate()
{
 return deliverydate;
}
public void setDeliverydate(int deliverydate)
{
	this.deliverydate=deliverydate;
}
public String getStatus()
{
 return status;
}
public void setStatus(String status)
{
	this.status=status;
}
public int getAmount()
{
 return amount;
}
public void setAmount(int amount)
{
	this.amount=amount;
}
}
