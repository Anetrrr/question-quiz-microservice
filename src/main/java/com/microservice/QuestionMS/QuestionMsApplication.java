package com.microservice.QuestionMS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.microservice.QuestionMS"})

public class QuestionMsApplication {

	public static void main(String[] args) {
		SpringApplication.run(QuestionMsApplication.class, args);
	}

}
