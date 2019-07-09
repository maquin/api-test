package com.springboot.mcs.apitest.dao.impl;

import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;
import org.w3c.dom.ls.LSInput;

import com.springboot.mcs.apitest.dao.PersonaDao;
import com.springboot.mcs.apitest.model.Persona;
import com.springboot.mcs.apitest.rowmapper.PersonaRowMapper;

@Repository
public class PersonaDaoImpl extends JdbcDaoSupport implements PersonaDao {

	public PersonaDaoImpl(DataSource dataSource) {
		this.setDataSource(dataSource);
	}

	@Override
	public List<Persona> getAllPersonas() {
		List<Persona> listaPersonas = new ArrayList<Persona>();
		
		String sql = "select id,"
				+ "nombres,"
				+ "apellidoPaterno,"
				+ "apellidoMaterno,"
				+ "sexo,"
				+ "direccion ,	"
				+ "estadoCivil "
				+ "from persona";
		
		try {
			
			RowMapper<Persona> personaRow = new PersonaRowMapper();
			listaPersonas = getJdbcTemplate().query(sql, personaRow);
			logger.debug("Se han traido las siguientes personas : "+listaPersonas.toString());
			
		} catch (Exception e) {
			logger.error(e.getMessage());
		}
		
		return listaPersonas;
	}

	@Override
	public Persona getPersona(Integer id) {

		

		return null;
	}

	@Override
	public void savePersona(Persona persona) {

		

	}

	@Override
	public void deletePersona(Integer id) {

	
	}

}
