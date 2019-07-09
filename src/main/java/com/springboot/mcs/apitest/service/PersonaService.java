package com.springboot.mcs.apitest.service;

import java.util.List;

import com.springboot.mcs.apitest.model.Persona;

public interface PersonaService {
	
	List<Persona> getAllPersonas();
	Persona getPersona(Integer id);
	void savePersona(Persona persona);
	void deletePersona(Integer id);

}
