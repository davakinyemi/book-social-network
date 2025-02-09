package com.davakinyemi.booknet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class BooknetApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(BooknetApiApplication.class, args);
	}

}
