package com.seijinsoftware.SmartCity.user;

import com.seijinsoftware.SmartCity.database.Registration;
import com.seijinsoftware.SmartCity.utils.SmartCityUser;

public class Businessman extends Registration {

	public Businessman(String username, String firstName, String lastName, String password, String address, String mobile, String email) {
		super(username, firstName, lastName, password, address, mobile, email, SmartCityUser.BUSINESSMAN.getCode());
	}

}
