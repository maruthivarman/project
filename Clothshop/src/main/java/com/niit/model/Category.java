package com.niit.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Entity
@Table(name="category")
@Component
public class Category {
	
	@Id
	@Column
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int categoryid;
	
	@Column
	private String categoryname;
	@Column
	private String description;
	
	//@OneToMany(cascade=CascadeType.ALL)
	//@JoinColumn(name = "categoryid")
	//private Category category;
	
	public int getCategoryid()
	{
	 return categoryid;
	}
	public void setcategoryid(int categoryid)
	{
		this.categoryid=categoryid;
	}
	public String getCategoryname()
	{
	 return categoryname;
	}
	public void setCategoryname(String categoryname)
	{
		this.categoryname=categoryname;
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

