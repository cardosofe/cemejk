package com.cemejk;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

<<<<<<< HEAD
import com.cemejk.entities.Administrador;
import com.cemejk.repository.AdminRepository;
import com.cemejk.service.AdminServiceImpl;

=======
>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534

@SpringBootApplication(exclude = { SecurityAutoConfiguration.class })
public class CemejkApplication {

	public static void main(String[] args) {
		SpringApplication.run(CemejkApplication.class, args);
		System.out.println(new BCryptPasswordEncoder().encode("123"));
	}

}
