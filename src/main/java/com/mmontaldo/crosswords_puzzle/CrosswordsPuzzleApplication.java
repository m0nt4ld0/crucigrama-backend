package com.mmontaldo.crosswords_puzzle;
import io.github.cdimascio.dotenv.Dotenv;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class CrosswordsPuzzleApplication {

    public static void main(String[] args) {
        if (System.getenv("RENDER") == null) {
			
            Dotenv dotenv = Dotenv.configure().ignoreIfMissing().load();

            dotenv.entries().forEach(entry -> {
                String key = entry.getKey();
                String value = entry.getValue();
                if (key != null && value != null) {
                    System.setProperty(key, value);
                }
            });
			
            String dbUrl = dotenv.get("DB_HOST");
            String dbUser = dotenv.get("DB_USER");
            String dbPassword = dotenv.get("DB_PASSWORD");

            if (dbUrl == null || dbUser == null || dbPassword == null) {
                throw new IllegalStateException("Missing required database environment variables.");
            }
        }
        
        // Iniciar la aplicación Spring Boot
        SpringApplication.run(CrosswordsPuzzleApplication.class, args);
    }
}
