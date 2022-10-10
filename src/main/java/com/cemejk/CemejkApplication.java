package com.cemejk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;


@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class CemejkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CemejkApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}

}
