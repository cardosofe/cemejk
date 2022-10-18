package com.cemejk.controller;

import org.springframework.beans.factory.annotation.Autowired;

import com.cemejk.repository.MemoriaRepository;
import com.cemejk.service.MemoriaServiceImpl;

public class MemoriaController {

	@Autowired
	MemoriaServiceImpl memoriaService;
	@Autowired
	MemoriaRepository memoriaRepository;
}
