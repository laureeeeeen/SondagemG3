package com.example.demo.entities;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "forum")
@Entity
public class Forum {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String tituloForum;

	private String descricao;
	
	private String  dataCriacao;
	

	public Forum(Long id, String tituloForum, String descricao, String dataCriacao) {
		super();
		this.id = id;
		this.tituloForum = tituloForum;
		this.descricao = descricao;
		this.dataCriacao = dataCriacao;
	}

	Forum(){}
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTituloForum() {
		return tituloForum;
	}

	public void setTituloForum(String tituloForum) {
		this.tituloForum = tituloForum;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getDataCriacao() {
		return dataCriacao;
	}

	public void setDataCriacao(String dataCriacao) {
		this.dataCriacao = dataCriacao;
	}

}
