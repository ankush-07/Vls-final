package com.cjc.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
public class SpringBootJpaApplication {

	public static void main(String[] args) {
		System.out.println("Hello Spring boot jpa");
		SpringApplication.run(SpringBootJpaApplication.class, args);
	}

}
