package com.official.popcornclub.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.official.popcornclub.model.Filme;
import com.official.popcornclub.repository.FilmeRepository;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/filmes")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class FilmeController {
	
	@Autowired
	private FilmeRepository filmeRepository;
	
	@GetMapping
	public ResponseEntity<List<Filme>> getAll(){
		return ResponseEntity.ok(filmeRepository.findAll());
	}
	
	@GetMapping("/titulo/{titulo}")
	public ResponseEntity<List<Filme>> getByTitulo(@PathVariable String titulo){
		return ResponseEntity.ok(filmeRepository.findByTituloContainingIgnoreCase(titulo));
	}
	
	@GetMapping("/genero/{genero}")
	public ResponseEntity<List<Filme>> getByGenero(@PathVariable String genero){
		return ResponseEntity.ok(filmeRepository.findByGeneroContainingIgnoreCase(genero));
	}
	
	@PostMapping("/cadastrar")
	public ResponseEntity<Filme> post(@Valid @RequestBody Filme filme){
		return ResponseEntity.status(HttpStatus.CREATED)
				.body(filmeRepository.save(filme));
	}

}
