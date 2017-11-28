package com.co.pojorespuestas;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hola")
public class HolaMundo {
	
	//@GET
	//@Path("/hola")
	//@Produces(MediaType.APPLICATION_JSON)///sirvio sin este tambien 
	///http://localhost:8080/ 
	/*public String Saludar() {
		return "hola servicio restsss";
	}*/
	@GET
	@Path("/prueba")
	@Produces(MediaType.TEXT_PLAIN)  
	//http://localhost:8080/activo/api/saludo/hola
	public String Saludar() {
		return "hola servicio rest prodices";
	}

}