package com.springboot.mcs.apitest.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.springboot.mcs.apitest.model.Persona;

public class PersonaRowMapper implements RowMapper<Persona> {

	@Override
	public Persona mapRow(ResultSet rs, int rowNum) throws SQLException {
		
		Persona persona = new Persona();
		persona.setId(rs.getInt("id"));
		persona.setNombres(rs.getString("nombres"));
		persona.setApellidoPaterno(rs.getString("apellidoPaterno"));
		persona.setApellidoMaterno(rs.getString("apellidoMaterno"));
		persona.setDireccion(rs.getString("direccion"));
		persona.setSexo(rs.getString("sexo"));
		persona.setEstadoCivil(rs.getString("estadoCivil"));
				
		return persona;
	}

}
