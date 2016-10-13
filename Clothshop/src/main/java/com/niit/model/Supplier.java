package com.niit.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="supplier")
@Component
public class Supplier {
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
private int supplierid;
	@Column
private String suppliername;
	@Column
private String companyname;
	@Column
private String address;
	@Column
private String emailid;
	@Column
private int mobilenumber;

public int getSupplierid()
{
 return supplierid;
}
public void setSupplierid(int supplierid)
{
	this.supplierid=supplierid;
}
public String getSuppliername()
{
 return suppliername;
}
public void setSuppliername(String suppliername)
{
	this.suppliername=suppliername;
}
public String getCompanyname()
{
 return companyname;
}
public void setCompanyname(String companyname)
{
	this.companyname=companyname;
}
public String getAddress()
{
 return address;
}
public void setAddress(String address)
{
	this.address=address;
}
public String getEmailid()
{
 return emailid;
}
public void setEmailid(String emailid)
{
	this.emailid=emailid;
}
public int getMobilenumber()
{
 return mobilenumber;
}
public void setMobilenumber(int mobilenumber)
{
	this.mobilenumber=mobilenumber;
}
}
