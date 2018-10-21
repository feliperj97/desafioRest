package com.desafio.apirest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.desafio.apirest.model.Planeta;
import com.desafio.apirest.repository.PlanetaRepository;

@Controller
@RequestMapping(value="/api")
public class PlanetaController {
	@Autowired
	PlanetaRepository planetaRepository;
	
	@GetMapping("/planetas")
	public List<Planeta> listaPlanetas(){
		return planetaRepository.findAll();
	}

}
