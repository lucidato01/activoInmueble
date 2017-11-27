package com.co.serviciorest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import com.co.ejb.servicio.InmuebleEJBLocal;

@RequestScoped
@Path("")
@Produces({  "application/json" })
@Consumes({  "application/json" })
public class ServicioListaInmueble {
	
	@EJB
	InmuebleEJBLocal inmuebleEJB;
	//////crear el servicio rest 
	

}
