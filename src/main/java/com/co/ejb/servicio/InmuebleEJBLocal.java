package com.co.ejb.servicio;

import java.util.List;

import javax.ejb.Local;

import com.co.modelo.Inmueble;

@Local
public interface InmuebleEJBLocal {

	List<Inmueble> listInmuebleGeneral();
}
