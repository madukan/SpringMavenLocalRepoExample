package com.springmaven.exportingproject;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ExportingprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ExportingprojectApplication.class, args);
	}

	@Bean
	public ApplicationRunner runner() {
		return args -> {
			System.out.println("app runner started...");
			new ExportedFuntionality().sum(1,2);
			System.out.println("app runner completed.");
		};
	}

}
