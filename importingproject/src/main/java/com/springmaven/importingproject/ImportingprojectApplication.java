package com.springmaven.importingproject;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.springmaven.exportingproject.*;

@SpringBootApplication
public class ImportingprojectApplication {

	public static void main(String[] args) {
		SpringApplication.run(ImportingprojectApplication.class, args);
	}


	@Bean
	public ApplicationRunner runner() {
		return args -> {
			System.out.println("app runner started...");
			new ExportedFuntionality().sum(3,4);
			System.out.println("app runner completed.");
		};
	}

}
