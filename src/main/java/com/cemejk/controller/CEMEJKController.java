package com.cemejk.controller;

<<<<<<< HEAD
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cemejk.entities.Administrador;
import com.cemejk.repository.AdminRepository;
import com.cemejk.service.AdminServiceImpl;

@Controller
public class CEMEJKController {

	@Autowired
	AdminServiceImpl adminService;
	@Autowired
	AdminRepository adminRepository;

	@GetMapping("/login")
	public String showLogin() {
		adminService.findAll();
		return "/login";
	}
=======
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.cemejk.service.AdminServiceImpl;

import lombok.extern.slf4j.Slf4j;

@Controller
public class CEMEJKController {
	
	@Autowired
	AdminServiceImpl adminService;
	
	@GetMapping("/login")
	public String showLogin() {
		return "login";
	}

>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534
	
	@GetMapping("/poslogin")
	public String login() {
		return "/poslogin";
	}
	
<<<<<<< HEAD
	@PostMapping("/cadastrar")
	public String registraAdmin(@RequestParam(name = "user") String email, @RequestParam(name = "psw") String psw,
			@RequestParam(name = "name") String nome) {
		LocalDate data = LocalDate.now();
		Administrador admin = new Administrador(nome, email, new BCryptPasswordEncoder().encode(psw), data);
		adminService.save(admin);
		return "/cadastrar";
	}

	@DeleteMapping(value = "/deletar")
	@ResponseBody
	public ResponseEntity<Object> deletaAdmin(@RequestParam(name = "id_admin") Long id_admin) {
		if(adminService.findById(id_admin).isPresent()) {
			adminService.deleteById(id_admin);
			return ResponseEntity.ok().build();
		}
		return ResponseEntity.notFound().build();
	}
=======
	
>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534

}
