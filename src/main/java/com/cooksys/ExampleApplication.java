package com.cooksys;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.Ordered;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import com.cooksys.entity.AppUser;

@SpringBootApplication
@Configuration
@RestController
public class ExampleApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(ExampleApplication.class, args);
	}
		
}