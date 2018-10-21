package com.desafio.apirest.repository;

import com.desafio.apirest.model.Planeta;

public interface PlanetaRepository {
	Planeta findByID(long id);
}
