package com.bajdandesign.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class LoginController {
	
	@GetMapping("/hello")
	public String hello(String name, Model model) {

		return "hello";
	}

	@GetMapping("/login")
	public String greeting(String name, Model model) {
		System.out.println("login");
		return "login";
	}
}