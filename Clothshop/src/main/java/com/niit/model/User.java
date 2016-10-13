package com.niit.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import org.springframework.stereotype.Component;

@Entity
@Table(name="user")
@Component
public class User {
	
	@Id
	@Column
	@GeneratedValue
	private int userid;
	@Column
	private String username;
	@Column
	private String emailid;
	@Column
	private String password;
	@Column
	private String gender;
	@Column
	private long mobile_number;
	@Column
	private String address;
	
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "userid")
	private Role role;

	
	public Role getRole() {
		return role;
	}
	public void setRole(Role role) {
		this.role = role;
	}
	
	
	public int getUserid()
	{
	 return userid;
	}
	public void setUserid(int userid)
	{
		this.userid=userid;
	}
	public String getUsername()
	{
	 return username;
	}
	public void setUsername(String username)
	{
		this.username=username;
	}
	public String getEmailid()
	{
	 return emailid;
	}
	public void setEmailid(String emailid)
	{
		this.emailid=emailid;
	}
	public String getPassword()
	{
	 return password;
	}
	public void setPassword(String password)
	{
		this.password=password;
	}
	
	public long getMobile_number() {
		return mobile_number;
	}
	public void setMobile_number(long mobile_number) {
		this.mobile_number = mobile_number;
	}
	
	public String getGender()
	{
	 return gender;
	}
	public void setGender(String gender)
	{
		this.gender=gender;
	}
	
	public String getAddress()
	{
	 return address;
	}
	public void setAddress(String address)
	{
		this.address=address;
	}
	

}
