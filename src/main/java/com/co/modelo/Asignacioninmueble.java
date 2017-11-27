package com.co.modelo;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author Fabian
 */
@Entity
@Table(name = "asignacioninmueble")
@NamedQueries({ @NamedQuery(name = "Asignacioninmueble.findAll", query = "SELECT a FROM Asignacioninmueble a") })
public class Asignacioninmueble implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 4480138166364251535L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Basic(optional = false)
	@Column(name = "idAsignacionInmueble")
	private Integer idAsignacionInmueble;
	@JoinColumn(name = "numeroInternoI", referencedColumnName = "numeroInternoI")
	@ManyToOne(optional = false)
	private Inmueble numeroInternoI;
	@JoinColumn(name = "cedulaPersona", referencedColumnName = "cedulaPersona")
	@ManyToOne
	private Persona cedulaPersona;
	@JoinColumn(name = "idArea", referencedColumnName = "idArea")
	@ManyToOne
	private Area idArea;

	public Asignacioninmueble() {
	}

	public Asignacioninmueble(Integer idAsignacionInmueble) {
		this.idAsignacionInmueble = idAsignacionInmueble;
	}

	public Integer getIdAsignacionInmueble() {
		return idAsignacionInmueble;
	}

	public void setIdAsignacionInmueble(Integer idAsignacionInmueble) {
		this.idAsignacionInmueble = idAsignacionInmueble;
	}

	public Inmueble getNumeroInternoI() {
		return numeroInternoI;
	}

	public void setNumeroInternoI(Inmueble numeroInternoI) {
		this.numeroInternoI = numeroInternoI;
	}

	public Persona getCedulaPersona() {
		return cedulaPersona;
	}

	public void setCedulaPersona(Persona cedulaPersona) {
		this.cedulaPersona = cedulaPersona;
	}

	public Area getIdArea() {
		return idArea;
	}

	public void setIdArea(Area idArea) {
		this.idArea = idArea;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (idAsignacionInmueble != null ? idAsignacionInmueble.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Asignacioninmueble)) {
			return false;
		}
		Asignacioninmueble other = (Asignacioninmueble) object;
		if ((this.idAsignacionInmueble == null && other.idAsignacionInmueble != null)
				|| (this.idAsignacionInmueble != null
						&& !this.idAsignacionInmueble.equals(other.idAsignacionInmueble))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "mapeose.Asignacioninmueble[ idAsignacionInmueble=" + idAsignacionInmueble + " ]";
	}

}
