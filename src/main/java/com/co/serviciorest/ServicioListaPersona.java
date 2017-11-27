package com.co.serviciorest;

import javax.ejb.EJB;
import javax.enterprise.context.RequestScoped;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.co.ejb.servicio.PersonaEJB;
import com.co.ejb.servicio.PersonaEJBLocal;
import com.co.modelo.Persona;
import com.co.pojorespuestas.JsonPersonaString;
import com.fasterxml.jackson.databind.ObjectMapper;

@RequestScoped
@Path("/persona")
@Produces({ "application/json" })
// @Consumes({ "application/xml", "application/json" })
public class ServicioListaPersona {

	@EJB
	PersonaEJBLocal personaEJB;

	@GET
	@Path("/people")
	@Produces({ MediaType.APPLICATION_JSON })
	public String listadoPersonas() {

		String personaString = "";
		try {
			ObjectMapper mapper = new ObjectMapper();

			PersonaEJB personaEjb = new PersonaEJB();
			// personaEjb.listPersonaGeneral();
			personaString = mapper.writeValueAsString(personaEjb.listPersonaGeneral());

			//
			// JsonPersonaString personaString = mapper.readValue();
			System.out.println("Persona String " + personaString.toString());
		} catch (Exception e) {
			// TODO: handle exception
		}
		return personaString;
	}

}
