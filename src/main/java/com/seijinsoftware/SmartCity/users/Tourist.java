package com.seijinsoftware.SmartCity.users;

import com.seijinsoftware.SmartCity.database.GenericUser;

public class Tourist extends GenericUser {
	
	public Tourist(String id, String name, String password, String address, String mobile, String email) {
		super(id, name, password, address, mobile, email);
	}
	
	public void viewHotels() {
		
	}
	
	public void viewCityMap() {
		
	}
	
	public void viewCityGuide() {
		
	}
}
