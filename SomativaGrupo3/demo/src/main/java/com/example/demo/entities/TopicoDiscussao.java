package com.example.demo.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Table(name = "topicoDiscussao")
@Entity
public class TopicoDiscussao {


	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String titulo;
	
	private String mensagemInicial;
	
	private String autor;
	
	private String dataCriacao;
	

    @ManyToOne
    @JoinColumn(name = "forum_id")
    private Forum forum;

	TopicoDiscussao(){}
	
	public TopicoDiscussao(Long id, String titulo, String mensagemInicial, String autor, String dataCriacao, Forum forum) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.mensagemInicial = mensagemInicial;
		this.autor = autor;
		this.dataCriacao = dataCriacao;
		this.forum = forum;
	}


	
	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}

	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getMensagemInicial() {
		return mensagemInicial;
	}


	public void setMensagemInicial(String mensagemInicial) {
		this.mensagemInicial = mensagemInicial;
	}


	public String getAutor() {
		return autor;
	}


	public void setAutor(String autor) {
		this.autor = autor;
	}


	public String getDataCriacao() {
		return dataCriacao;
	}


	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

	
	
	

}
