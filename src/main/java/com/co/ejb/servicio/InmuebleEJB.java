package com.co.ejb.servicio;

import java.util.List;

import javax.ejb.LocalBean;
import javax.ejb.Stateless;

import com.co.dao.IDaoActivo;
import com.co.modelo.Inmueble;

/**
 * Session Bean implementation class InmuebleEJB
 */
@Stateless
public class InmuebleEJB implements InmuebleEJBLocal {

	private IDaoActivo daoActivo;

	/**
	 * Default constructor.
	 */
	public InmuebleEJB() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public List<Inmueble> listInmuebleGeneral() {

		List<Inmueble> listaInmueble = null;
		try {
			listaInmueble = daoActivo.listaActivosGeneral();
		} catch (Exception e) {

		}

		return listaInmueble;
	}

}
