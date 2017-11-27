package com.co.ejb.servicio;

import java.util.List;

import javax.ejb.Local;

import com.co.modelo.Persona;

@Local
public interface PersonaEJBLocal {
	List<Persona> listPersonaGeneral();

}
