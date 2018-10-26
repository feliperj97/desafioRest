package com.desafio.apirest.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.apirest.model.Planeta;
import com.desafio.apirest.repository.PlanetaRepository;

@RestController
@RequestMapping("/api")
public class PlanetaController {
	
	@Autowired
	PlanetaRepository planetaRepository;
	
	@GetMapping("/planetas") //Listando todos os planetas
	public List<Planeta> listaPlanetas(){
		return planetaRepository.findAll();
	}
	
	@GetMapping("/planeta/{codigo}") //Busca por ID
	public Optional<Planeta> listaPlaneta(@PathVariable String codigo){
		return planetaRepository.findById(codigo);
	}
	
	@GetMapping("/planetas/search") //Busca por nome
	Planeta findByName(@RequestParam(value="name", required=true) String name){
		return planetaRepository.findByNome(name);
	}
	 @PostMapping("/planetas") //Incluindo novo planeta
	 public void inserePlaneta(@RequestBody Planeta planeta) {
	        planetaRepository.save(planeta);
	    }
	 
	 @PutMapping("/planeta") //Atualizando planeta
	 public Planeta editaPlaneta(@RequestBody Planeta planeta) {
		 return planetaRepository.save(planeta);
	 }
	 
	 @DeleteMapping("/planeta") //Deletando planeta
	 public void deletaPlaneta(@RequestBody Planeta planeta) {
		 planetaRepository.delete(planeta);
	 }
	 
	 @DeleteMapping("/planeta/{codigo}") //Deletando pelo ID
	 public void deletaPlanetaById(@PathVariable String codigo) {
		 planetaRepository.deleteById(codigo);
	 }
	 
	
}
