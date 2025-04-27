package com.official.popcornclub.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.official.popcornclub.model.Filme;

public interface FilmeRepository extends JpaRepository<Filme, Long>{
	
	 public List<Filme>findByTituloContainingIgnoreCase(@Param("titulo") String titulo);
     public List<Filme>findByGeneroContainingIgnoreCase(@Param("genero") String genero);
	
}
