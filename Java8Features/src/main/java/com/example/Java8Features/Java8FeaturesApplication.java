package com.example.Java8Features;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages ="com.example.Java8Features")
public class Java8FeaturesApplication {

	public static void main(String[] args) {
		SpringApplication.run(Java8FeaturesApplication.class, args);
	}

}
