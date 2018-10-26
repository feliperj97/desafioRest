package com.desafio.apirest.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.annotation.Transient;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="planeta")
public class Planeta {
	@Id
	private String codigo;
	private String nome;
	private String terreno;
	private String clima;
	@Transient
	private int numFilmes;
	
	public int getNumFilmes() {
		return numFilmes;
	}
	public void setNumFilmes(int numFilmes) {
		this.numFilmes = numFilmes;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTerreno() {
		return terreno;
	}
	public void setTerreno(String terreno) {
		this.terreno = terreno;
	}
	public String getClima() {
		return clima;
	}
	public void setClima(String clima) {
		this.clima = clima;
	}
	
	
	
}
