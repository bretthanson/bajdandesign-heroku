package com.bajdandesign.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LoginController {

	@GetMapping("/login")
	public String greeting(String name, Model model) {
		System.out.println("login");
		return "login";
	}
}