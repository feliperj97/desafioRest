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
	
	@GetMapping("/planeta/{codigo}") //Exibindo um único planeta
	public Optional<Planeta> listaPlaneta(@PathVariable String codigo){
		return planetaRepository.findById(codigo);
	}
		
	 @PostMapping("/planetas") //Incluindo novo planeta
	 public void inserePlaneta(@RequestBody Planeta planeta) {
	        planetaRepository.save(planeta);
	    }
	 
	 @PutMapping("/planeta") //Atualizando planeta
	 public Planeta editaPlaneta(@RequestBody Planeta planeta) {
		 return planetaRepository.save(planeta);
	 }
	 
	 @DeleteMapping("/planeta")
	 public void deletaPlaneta(@RequestBody Planeta planeta) {
		 planetaRepository.delete(planeta);
	 }
	 
	 
	
}
