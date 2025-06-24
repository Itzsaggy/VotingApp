package com.voting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = "com.voting.model")
public class VotingappApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotingappApplication.class, args);
	}

}
