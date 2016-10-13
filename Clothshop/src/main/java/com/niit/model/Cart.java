package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="cart")
@Component
public class Cart {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userid;
	@Column
private int productid;
	@Column
private int quantity;
	@Column
private int price;
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
public int getQuantity()
{
 return quantity;
}
public void setQuantity(int quantity)
{
	this.quantity=quantity;
}
public int getPrice()
{
 return price;
}
public void setPrice(int price)
{
	this.price=price;
}
}
