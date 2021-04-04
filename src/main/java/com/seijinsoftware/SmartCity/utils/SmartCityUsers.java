package com.seijinsoftware.SmartCity.utils;

import com.seijinsoftware.SmartCity.exception.EnumerationException;

public enum SmartCityUsers {
	
	STUDENT		("Student", "S"),
	TURIST		("Turist", "T"),
	BUSINESSMAN	("Businessman", "B"),
	ADMIN		("Administrator", "A");
	
	private static final String	EXCEPTION_MESSAGE_FORMAT	= "Unknown enumeration type '%s'";
	
	private String description;
	private String code;
	
	private SmartCityUsers(String description, String code) {
		this.description = description;
		this.code = code;
	}
	
	public String getDescription() {
		return this.description;
	}
	
	public String getCode() {
		return this.code;
	}
	
	/**
	 * Gets the enum type EstadoPedido, by the code of the request state.
	 * 
	 * @param code
	 *        the code of the request state
	 * @return EstadoPedido enumeration that represents the EstadoPedido.
	 * @throws EnumerationException
	 *         the checked Exception when the code is not valid
	 */
	public static SmartCityUsers enumOf(String code) throws EnumerationException {
		SmartCityUsers[] enumerationArray = values();

		for(SmartCityUsers enumeration : enumerationArray){
			if(enumeration.getCode().equalsIgnoreCase(code)){
				return enumeration;
			}
		}

		throw new EnumerationException(String.format(EXCEPTION_MESSAGE_FORMAT, code));
	}

	/**
	 * Gets the enum type SmartCityUsers, by the description of the request state.
	 * This Method throws an checked exception EnumerationUncheckedException when the code is invalid.
	 * 
	 * @param code
	 *        the description of the request state
	 * @return EstadoPedido enumeration that represents the EstadoPedido.
	 * @throws EnumerationException
	 *         the checked Exception when the code is not valid
	 */
	public static SmartCityUsers enumOfByDescription(String description) throws EnumerationException {
		SmartCityUsers[] enumerationArray = values();

		for(SmartCityUsers enumeration : enumerationArray){
			if(enumeration.getDescription().equalsIgnoreCase(description)){
				return enumeration;
			}
		}

		throw new EnumerationException(String.format(EXCEPTION_MESSAGE_FORMAT, description));
	}
	
}
