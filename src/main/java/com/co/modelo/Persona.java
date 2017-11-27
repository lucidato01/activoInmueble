package com.co.modelo;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Fabian
 */
@Entity
@Table(name = "persona", catalog = "activo", schema = "")
@XmlRootElement
@NamedQueries({ @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p"),
		@NamedQuery(name = "Persona.findByCedulaPersona", query = "SELECT p FROM Persona p WHERE p.cedulaPersona = :cedulaPersona"),
		@NamedQuery(name = "Persona.findByNombresPersona", query = "SELECT p FROM Persona p WHERE p.nombresPersona = :nombresPersona") })
public class Persona implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2584268610206364477L;
	@Id
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 10)
	@Column(name = "cedulaPersona", nullable = false, length = 10)
	private String cedulaPersona;
	@Basic(optional = false)
	@NotNull
	@Size(min = 1, max = 100)
	@Column(name = "nombresPersona", nullable = false, length = 100)
	private String nombresPersona;

	public Persona() {
	}

	public Persona(String cedulaPersona, String nombresPersona) {
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
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((cedulaPersona == null) ? 0 : cedulaPersona.hashCode());
		result = prime * result + ((nombresPersona == null) ? 0 : nombresPersona.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Persona other = (Persona) obj;
		if (cedulaPersona == null) {
			if (other.cedulaPersona != null)
				return false;
		} else if (!cedulaPersona.equals(other.cedulaPersona))
			return false;
		if (nombresPersona == null) {
			if (other.nombresPersona != null)
				return false;
		} else if (!nombresPersona.equals(other.nombresPersona))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Persona [cedulaPersona=" + cedulaPersona + ", nombresPersona=" + nombresPersona + "]";
	}

}
