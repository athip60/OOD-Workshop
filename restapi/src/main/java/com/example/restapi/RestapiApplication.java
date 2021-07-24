package com.example.restapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Random;

@SpringBootApplication
public class RestapiApplication {

	@Bean
	public Random createRandom() {
		return new Random();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx
				= SpringApplication.run(RestapiApplication.class, args);
	}

}
