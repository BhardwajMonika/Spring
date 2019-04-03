package com.niit.springcore;

public class UserAccountService {

	private String name;
	private String description;
	private String details;
	
	public UserAccountService() {
		super();
		this.name = "Monika";
		this.description = "Account is Activated for Equity Trading.";
		this.details = "PPPQ10000.00";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
