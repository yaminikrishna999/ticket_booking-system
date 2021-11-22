package com.tbs.ticketbookingsystem.model.users;

import com.google.gson.annotations.SerializedName;

public class Admin{

	@SerializedName("password")
	private String password;

	@SerializedName("role")
	private String role;

	@SerializedName("mobile")
	private String mobile;

	@SerializedName("id")
	private String id;

	@SerializedName("userName")
	private String userName;

	@SerializedName("email")
	private String email;

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword(){
		return password;
	}

	public void setRole(String role){
		this.role = role;
	}

	public String getRole(){
		return role;
	}

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile(){
		return mobile;
	}

	public void setId(String id){
		this.id = id;
	}

	public String getId(){
		return id;
	}

	public void setUserName(String userName){
		this.userName = userName;
	}

	public String getUserName(){
		return userName;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail(){
		return email;
	}

	@Override
 	public String toString(){
		return 
			"Admin{" + 
			"password = '" + password + '\'' + 
			",role = '" + role + '\'' + 
			",mobile = '" + mobile + '\'' + 
			",id = '" + id + '\'' + 
			",userName = '" + userName + '\'' + 
			",email = '" + email + '\'' + 
			"}";
		}
}