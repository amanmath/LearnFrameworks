package com.aman.moviestore;

import com.aman.moviestore.repository.MovieRepo;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

@SpringBootApplication
@EnableMongoRepositories(basePackageClasses = MovieRepo.class)
public class MoviestoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(MoviestoreApplication.class, args);
	}

}
