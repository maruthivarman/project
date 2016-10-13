package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="codpayment")
@Component
public class Codpayment {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int userid;
	@Column
private int codpaymentid;
	@Column
private String address;
	@Column
private int mobilenumber;
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
public int getCodpaymentid()
{
 return codpaymentid;
}
public void setCodpaymentid(int codpaymentid)
{
	this.codpaymentid=codpaymentid;
}
public String getAddress()
{
 return address;
}
public void setAddress(String address)
{
	this.address=address;
}
public int getMobilenumber()
{
 return mobilenumber;
}
public void setMobilenumber(int mobilenumber)
{
	this.mobilenumber=mobilenumber;
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
