package com.cemejk.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cemejk.entities.Administrador;
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
	
	@Transactional
	public void delete(Long id) {
		memoriaRepository.deleteById(id);
	}

}
