package com.seijinsoftware.SmartCity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.seijinsoftware.SmartCity.model.FormLogIn;

@Controller
public class LogInController {

	private final String URL_LOGIN = "/login";
	
	@GetMapping(URL_LOGIN)
	public String signIn() {
		return "/homePage/login";
	}
	
	@PostMapping(URL_LOGIN)
	public String signUp(Model model, FormLogIn formLogIn) {
	
		return "";
	}
	
}
