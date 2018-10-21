package com.desafio.apirest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class Planeta {
	@Id
	private long id;
	private String nome;
	private String clima;
	private String terreno;
	private long qtdFilmes;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	public String getTerreno() {
		return terreno;
	}
	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}
	public long getQtdFilmes() {
		return qtdFilmes;
	}
	public void setQtdFilmes(long qtdFilmes) {
		this.qtdFilmes = qtdFilmes;
	}
	
}
