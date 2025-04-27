package com.official.popcornclub.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_filmes")
public class Filme {
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;
		
		@NotBlank(message = "O atributo é obrigatório")
		private String foto;
		
		@NotBlank(message = "O atributo é obrigatório")
	    private String titulo;
		
		@NotBlank(message = "O atributo é obrigatório")
	    private String diretor;
		
		@NotNull(message = "O atributo não pode ser nulo")
	    private int anoLancamento;
		
		@NotBlank(message = "O atributo é obrigatório")
	    private String genero;
		
		@NotBlank(message = "O atributo é obrigatório")
		@Size(min = 10, max = 1000, message = "O atributo deve conter no minímo 10 e no máximo 1000 caracters")
	    private String descricao;
		
		@NotBlank(message = "O atributo é obrigatório")
		@Size(min = 10, max = 100, message = "O atributo deve conter no minímo 10 e no máximo 1000 caracters")
	    private String comentario;
		
		@NotNull
	    private Double nota;
		
		//Métodos Getters and Setters

		public Long getId() {
			return id;
		}

		public void setId(Long id) {
			this.id = id;
		}

		public String getFoto() {
			return foto;
		}

		public void setFoto(String foto) {
			this.foto = foto;
		}

		public String getTitulo() {
			return titulo;
		}

		public void setTitulo(String titulo) {
			this.titulo = titulo;
		}

		public String getDiretor() {
			return diretor;
		}

		public void setDiretor(String diretor) {
			this.diretor = diretor;
		}

		public int getAnoLancamento() {
			return anoLancamento;
		}

		public void setAnoLancamento(int anoLancamento) {
			this.anoLancamento = anoLancamento;
		}

		public String getGenero() {
			return genero;
		}

		public void setGenero(String genero) {
			this.genero = genero;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}

		public String getComentario() {
			return comentario;
		}

		public void setComentario(String comentario) {
			this.comentario = comentario;
		}

		public Double getNota() {
			return nota;
		}

		public void setNota(Double nota) {
			this.nota = nota;
		}
		
		
		
}
