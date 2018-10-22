package com.desafio.apirest.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.desafio.apirest.model.Planeta;

public interface PlanetaRepository extends MongoRepository<Planeta, String>{

}
