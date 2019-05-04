package com.ua.LegoCarRemoteController.model;

public class Command 
{
	private String name;
	
	public Command(String name)
	{
		this.name = name;
	}
	
	public String getName()
	{
		return this.name;
	}
	
	public void setName(String name)
	{
		this.name = name;
	}
}
