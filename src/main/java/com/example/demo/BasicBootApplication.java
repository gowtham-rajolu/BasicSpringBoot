package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class BasicBootApplication {

	public static void main(String[] args) {
		ApplicationContext a=SpringApplication.run(BasicBootApplication.class, args);
		collage c=a.getBean(collage.class);
		c.activity();
	}

}
