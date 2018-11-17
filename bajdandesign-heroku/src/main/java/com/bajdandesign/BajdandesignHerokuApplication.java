package com.bajdandesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class BajdandesignHerokuApplication {
	
	@GetMapping("/")
	public String sayHi() {
		return "Hello 123567890";
	}

	public static void main(String[] args) {
		SpringApplication.run(BajdandesignHerokuApplication.class, args);
	}
}
