package com.example.RestApisProject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@ComponentScan("com.example.controller,com.example.service")
@EntityScan("com.example.entity")
@EnableJpaRepositories("com.example.repository")
public class RestApisProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestApisProjectApplication.class, args);
	}

}
