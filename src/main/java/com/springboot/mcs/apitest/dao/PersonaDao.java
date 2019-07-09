package com.springboot.mcs.apitest.dao;

import java.util.List;

import com.springboot.mcs.apitest.model.Persona;

public interface PersonaDao {
	
	List<Persona> getAllPersonas();
	Persona getPersona(Integer id);
	void savePersona(Persona persona);
	void deletePersona(Integer id);

}
