package com.cemejk.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

<<<<<<< HEAD
import com.cemejk.entities.Administrador;
=======
>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534
import com.cemejk.entities.Memoria;
import com.cemejk.repository.MemoriaRepository;

@Service
public class MemoriaServiceImpl {

	@Autowired
	private MemoriaRepository memoriaRepository;

	public List<Memoria> findAll() {
		return memoriaRepository.findAll();
	}

	@Transactional
	public void save(Memoria memoria) {
		memoriaRepository.save(memoria);
	}

	public Optional<Memoria> findById(Long id) {
		return memoriaRepository.findById(id);
	}
<<<<<<< HEAD
	
	@Transactional
	public void delete(Long id) {
		memoriaRepository.deleteById(id);
	}

=======

	public void delete(Long id) {
		memoriaRepository.deleteById(id);

	}
>>>>>>> 0893d6c87f0ab21ae0187c0966125ac182b81534
}
