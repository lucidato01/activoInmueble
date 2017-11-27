package com.co.ejb.servicio;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.co.dao.IDaoPersona;
import com.co.modelo.Persona;

/**
 * Session Bean implementation class PersonaEJB
 */
@Stateless
public class PersonaEJB implements PersonaEJBLocal {

	private IDaoPersona daoPersona;

	/**
	 * Default constructor.
	 */
	public PersonaEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Persona> listPersonaGeneral() {

		List<Persona> listaPersona = null;

		try {
			listaPersona = daoPersona.listaPersona();
		} catch (Exception e) {

		}
		return listaPersona;
	}

}
