package com.bajdandesign;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Configuration;

@Configuration
@SpringBootApplication
public class BajdandesignHerokuApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(BajdandesignHerokuApplication.class, args);
	}

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BajdandesignHerokuApplication.class);
	}
}
