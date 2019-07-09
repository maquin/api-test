package com.springboot.mcs.apitest.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.mcs.apitest.dao.impl.PersonaDaoImpl;
import com.springboot.mcs.apitest.model.Persona;
import com.springboot.mcs.apitest.service.PersonaService;

@Service
public class PersonaServiceImpl implements PersonaService {

	@Autowired
	private PersonaDaoImpl _personalDao;
	
	@Override
	public List<Persona> getAllPersonas() {
		
		return _personalDao.getAllPersonas();
	}

	@Override
	public Persona getPersona(Integer id) {
		
		return _personalDao.getPersona(id);
	}

	@Override
	public void savePersona(Persona persona) {
		
		_personalDao.savePersona(persona);
	}

	@Override
	public void deletePersona(Integer id) {
		
		_personalDao.deletePersona(id);

	}

}
