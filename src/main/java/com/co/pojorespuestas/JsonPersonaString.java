package com.co.pojorespuestas;

public class JsonPersonaString {

	private String cedulaPersona;
	private String nombresPersona;

	public JsonPersonaString(String cedulaPersona, String nombresPersona) {
		super();
		this.cedulaPersona = cedulaPersona;
		this.nombresPersona = nombresPersona;
	}

	public String getCedulaPersona() {
		return cedulaPersona;
	}

	public void setCedulaPersona(String cedulaPersona) {
		this.cedulaPersona = cedulaPersona;
	}

	public String getNombresPersona() {
		return nombresPersona;
	}

	public void setNombresPersona(String nombresPersona) {
		this.nombresPersona = nombresPersona;
	}

	@Override
	public String toString() {
		return "JsonPersonaString [cedulaPersona=" + cedulaPersona + ", nombresPersona=" + nombresPersona + "]";
	}

	
}
