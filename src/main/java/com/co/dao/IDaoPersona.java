package com.co.dao;

import java.util.List;

import com.co.modelo.Persona;

/**
 *Interface para realizar  las operaciones de Persona  
 *@version 1.0
 *@author Fabian
 * * */
public interface IDaoPersona {
	
	/**
	 * Metodo para listar todas las Personas
	 * @return List<Persona> 
	 * */
	List<Persona> listaPersona(); 

}
