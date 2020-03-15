package com.DevOps.Capstone.Project.HTML;

import org.springframework.stereotype.Component;

@Component
public class LoginHTML 
{
	public String userID;
	public String password;
	public String name;
	public String AccNumber;
	
	public LoginHTML () {}
	public LoginHTML(String userID, String password, String name, String accNumber) {
		super();
		this.userID = userID;
		this.password = password;
		this.name = name;
		AccNumber = accNumber;
	}
	
	public String getName() {
		return this.name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAccNumber() {
		return AccNumber;
	}
	public void setAccNumber(String accNumber) {
		AccNumber = accNumber;
	}
	
	public String getUserID() {
		return this.userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
	}
	public String getPassword() {
		return this.password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
}
