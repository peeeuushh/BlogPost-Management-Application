package com.blog.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Users {
	
	@Id
	private int user_id;
	
	private String name;
	private String user_name;
	private String password;
	private String email;
	
	
	public Users(int user_id, String name, String user_name, String password, String email) {
		super();
		this.user_id = user_id;
		this.name = name;
		this.user_name = user_name;
		this.password = password;
		this.email = email;
	}
	
	public Users()
	{
		
	}

	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}


	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}

	
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}

	
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}

	
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public String toString() {
		return "User [user_id=" + user_id + ", name=" + name + ", user_name=" + user_name + ", password=" + password
				+ ", email=" + email + "]";
	}
	
	
	
}
