package com.web.rest.beans;

public class UserRegisterResponse 
{
	private String userName;
	private String fullName;
	private String response;
	private int regNumber;
	private int age;
	
	public String getUserName() 
	{
		return userName;
	}
	public void setUserName(String userName) 
	{
		this.userName = userName;
	}
	public String getFullName() 
	{
		return fullName;
	}
	public void setFullName(String fullName) 
	{
		this.fullName = fullName;
	}
	public String getResponse() 
	{
		return response;
	}
	public void setResponse(String response) 
	{
		this.response = response;
	}
	public int getRegNumber() 
	{
		return regNumber;
	}
	public void setRegNumber(int regNumber) 
	{
		this.regNumber = regNumber;
	}
	public int getAge() 
	{
		return age;
	}
	public void setAge(int age) 
	{
		this.age = age;
	}
}
