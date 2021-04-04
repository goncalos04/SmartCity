package com.seijinsoftware.SmartCity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class SignUpController {

	private final String URL_SIGNUP = "/signup";
	
	@GetMapping(URL_SIGNUP)
	public String signUp() {
		return "/homePage/signup";
	}
	
	@PostMapping(URL_SIGNUP)
	public String signUp(Model model) {
	
		return "";
	}
}
