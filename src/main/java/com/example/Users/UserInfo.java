package com.example.Users;

import org.springframework.data.annotation.Id;

public class UserInfo {
@Id
public String id;
	public String getId() {
	return id;
}

public void setId(String id) {
	this.id = id;
}
	public String name;
	public String brand;
	public String email;
	public String carnumber;
	
	public UserInfo() {
		
	}
	
	public UserInfo(String name, String brand, String email, String carnumber) {
		super();
		this.name = name;
		this.brand = brand;
		this.email = email;
		this.carnumber = carnumber;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCarnumber() {
		return carnumber;
	}
	public void setCarnumber(String carnumber) {
		this.carnumber = carnumber;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return name+"-"+carnumber;
	}
	
	
}
