package com.bajdandesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Configuration
@SpringBootApplication
public class BajdandesignHerokuApplication extends SpringBootServletInitializer {
	/*
	@GetMapping("/")
	public String sayHi() {
		return "Hello 123567890";
	} */

	public static void main(String[] args) {
		SpringApplication.run(BajdandesignHerokuApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BajdandesignHerokuApplication.class);
	}
}
