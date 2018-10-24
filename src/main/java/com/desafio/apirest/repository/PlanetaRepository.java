package com.desafio.apirest.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.desafio.apirest.model.Planeta;

public interface PlanetaRepository extends MongoRepository<Planeta, String>{
	Optional<Planeta> findById(String codigo);
	Planeta findByNome(String nome);
}
