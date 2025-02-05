package com.mmontaldo.crosswords_puzzle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import io.github.cdimascio.dotenv.Dotenv;

@SpringBootApplication
public class CrosswordsPuzzleApplication {

	public static void main(String[] args) {
		if (System.getenv("RENDER") == null) { 
			Dotenv dotenv = Dotenv.load();
			System.setProperty("SPRING_DATASOURCE_URL", dotenv.get("SPRING_DATASOURCE_URL"));
			System.setProperty("SPRING_DATASOURCE_USERNAME", dotenv.get("SPRING_DATASOURCE_USERNAME"));
			System.setProperty("SPRING_DATASOURCE_PASSWORD", dotenv.get("SPRING_DATASOURCE_PASSWORD"));
		}
		SpringApplication.run(CrosswordsPuzzleApplication.class, args);
	}

}
