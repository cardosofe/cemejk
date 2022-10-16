package com.cemejk.config.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@EnableWebSecurity
public class WebSecurity {

	
	
	   @Bean
	    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
	        http
	               .formLogin().loginPage("/login").defaultSuccessUrl("/poslogin", true).permitAll()
	               .and()
	               .authorizeHttpRequests()
	               .antMatchers(HttpMethod.GET, "/images/**").permitAll()
	               .antMatchers(HttpMethod.GET, "/style/**").permitAll()
	               .antMatchers("/admin").hasRole("ADMIN")
	               .antMatchers("/user").hasRole("USER")
	               .anyRequest().authenticated()
	               .and()
	               .logout()
	               .logoutUrl("/logout")
	               .and()
	               .csrf().disable();
	        return http.build();
	    }

	    @Bean
	    public PasswordEncoder passwordEncoder() {
	        return new BCryptPasswordEncoder();
	    }
	}