package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="cardpayment")
@Component
public class Cardpayment {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int cardpaymentid;
	@Column
private String cardholdername;
	@Column
private int cardnumber;
	@Column
private String cardtype;
	@Column
private int cvvnumber;
	@Column
private int expirydate;


public int getCardpaymentid()
{
 return cardpaymentid;
}
public void setCardpaymentid(int cardpaymentid)
{
	this.cardpaymentid=cardpaymentid;
}
public String getCardholdername()
{
 return cardholdername;
}
public void setCardholdername(String cardholdername)
{
	this.cardholdername=cardholdername;
}
public int getCardnumber()
{
 return cardnumber;
}
public void setCardnumber(int cardnumber)
{
	this.cardnumber=cardnumber;
}
public String getCardtype()
{
 return cardtype;
}
public void setCardtype(String cardtype)
{
	this.cardtype=cardtype;
}
public int getCvvnumber()
{
 return cvvnumber;
}
public void setCvvnumber(int cvvnumber)
{
	this.cvvnumber=cvvnumber;
}
public int getExpirydate()
{
 return expirydate;
}
public void setExpirydate(int expirydate)
{
	this.expirydate=expirydate;
}
}
