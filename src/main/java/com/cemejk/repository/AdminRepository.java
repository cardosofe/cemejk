package com.cemejk.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cemejk.entities.Administrador;

@Repository
public interface AdminRepository extends JpaRepository<Administrador, Long> {

<<<<<<< HEAD
	Optional<Administrador> findByEmail(String email);
	Optional<Administrador> findById(Long id_admin);
=======
	Optional <Administrador> findByEmail(String email);
>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534
	
}	
