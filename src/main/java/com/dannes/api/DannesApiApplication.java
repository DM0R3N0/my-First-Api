package com.dannes.api;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@ComponentScan("com.dannes")
public class DannesApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(DannesApiApplication.class, args);
	}

}
