package com.cemejk.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cemejk.entities.Administrador;

@Repository
public interface AdminRepository extends JpaRepository<Administrador, Long> {

	Optional<Administrador> findByEmail(String email);
	Optional<Administrador> findById(Long id_admin);
	
}	
