package com.cemejk.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.cemejk.entities.Administrador;
import com.cemejk.repository.AdminRepository;

@Service
@Transactional
public class AdminServiceImpl implements UserDetailsService {

	@Autowired
	private AdminRepository adminRepository;

	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
		Administrador admin = adminRepository.findByEmail(email)
				.orElseThrow(() -> new UsernameNotFoundException("User not found with username " + email));
		return admin;
	}

	public List<Administrador> findAll() {
		return adminRepository.findAll();
	}

	@Transactional
	public void save(Administrador admin) {
		adminRepository.save(admin);
	}

<<<<<<< HEAD
	public Optional<Administrador> findById(Long id_admin) {

		return adminRepository.findById(id_admin);
	}

	public void deleteById(Long id_admin) {
		adminRepository.deleteById(id_admin);
=======
	public Optional<Administrador> findById(Long id) {

		return adminRepository.findById(id);
	}

	public void delete(Long id) {
		adminRepository.deleteById(id);
>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534

	}


	
}
