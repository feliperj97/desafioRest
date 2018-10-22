package com.desafio.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.desafio.apirest.model.Planeta;
import com.desafio.apirest.repository.PlanetaRepository;

@RestController
@RequestMapping("/api")
public class PlanetaController {
	
	@Autowired
	PlanetaRepository planetaRepository;
	
	@GetMapping("/planetas")
	public List<Planeta> listaPlanetas(){
		return planetaRepository.findAll();
	}
	
	 @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
	    public void create(@RequestBody Planeta planeta) {
	        planetaRepository.save(planeta);
	    }
	
}
