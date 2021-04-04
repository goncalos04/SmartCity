package com.seijinsoftware.SmartCity.database;

public class Registration extends LoginData {

	private String firstName;
	private String lastName;
	private String address;
	private String mobile;
	private String email;
	private String typeOfUser;
	
	public Registration(String id, String firstName, String lastName, String password, String address, String mobile, String email, String typeOfUser) {
		super(id, password);
		
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.mobile = mobile;
		this.email = email;
		this.typeOfUser = typeOfUser;
		
	}
	
	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTypeOfUser() {
		return typeOfUser;
	}

	public void setTypeOfUser(String typeOfUser) {
		this.typeOfUser = typeOfUser;
	}
	
	public void check() {
		
	}
	
	public void valid() {
		
	}
	
	public void random() {
		
	}
}
