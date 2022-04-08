package com.example.learn;

import com.example.learn.service.databaseInitService.DatabaseInitialization;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@AllArgsConstructor
public class LearnApplication implements CommandLineRunner {

	final private DatabaseInitialization databaseInitialization;

	public static void main(String[] args) {
		SpringApplication.run(LearnApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {

		databaseInitialization.init();
	}
}
