package com.co.dao;

import java.util.List;
 
import com.co.modelo.Inmueble;

/**
 *Interface para realizar  las operaciones de los activos  
 *@version 1.0
 *@author Fabian
 * * */
public interface IDaoActivo {
	
	/**
	 * Metodo para listar todos los activos de la empresa
	 * @return List<Activo> 
	 * */
	List<Inmueble> listaActivosGeneral(); 
	
	
	 

}
