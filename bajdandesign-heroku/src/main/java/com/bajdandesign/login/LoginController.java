package com.bajdandesign.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/")
public class LoginController {

	@RequestMapping(method = RequestMethod.GET)
	public String home(Model model) {
		return "home";
	}

	@GetMapping("/login")
	public String greeting(String name, Model model) {
		System.out.println("login");
		return "login";
	}
}