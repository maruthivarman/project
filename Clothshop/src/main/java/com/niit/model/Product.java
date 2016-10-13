package com.niit.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="product")
@Component
public class Product {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int productid;
	@Column
	private String productname;
	@Column
	private int price;
	@Column
	private String size;
	@Column
	private int categoryid;
	@Column
	private int supplierid;
	@Column
	private String color;
	@Column
	private String description;
	//@ManyToOne(cascade = CascadeType.ALL)
	//@JoinColumn(name = "categoryid")
	
	//private Category category;
	
	public int getProductid()
	{
	 return productid;
	}
	public void setProductid(int productid)
	{
		this.productid=productid;
	}
	public String getProductname()
	{
	 return productname;
	}
	public void setProductname(String productname)
	{
		this.productname=productname;
	}	
	public int getPrice()
	{
	 return price;
	}
	public void setPrice(int price)
	{
		this.price=price;
	}
	public String getSize()
	{
	 return size;
	}
	public void setSize(String size)
	{
		this.size=size;
	}
	public int getCategoryid()
	{
	 return categoryid;
	}
	public void setCategoryid(int categoryid)
	{
		this.categoryid=categoryid;
	}
	public int getSupplierid()
	{
	 return supplierid;
	}
	public void setSupplierid(int supplierid)
	{
		this.supplierid=supplierid;
	}
	public String getColor()
	{
	 return color;
	}
	public void setColor(String color)
	{
		this.color=color;
	}	
	public String getDescription()
	{
	 return description;
	}
	public void setDescription(String description)
	{
		this.description=description;
	}	
}
