package com.co.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Fabian
 */
@Entity
@Table(name = "inmueble")
@NamedQueries({ @NamedQuery(name = "Inmueble.findAll", query = "SELECT i FROM Inmueble i") })
public class Inmueble implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3804416509256349045L;
	@Id
	@Basic(optional = false)
	@Column(name = "numeroInternoI")
	private Integer numeroInternoI;
	@Basic(optional = false)
	@Column(name = "serialInmueble")
	private String serialInmueble;
	@Basic(optional = false)
	@Column(name = "nombreInmueble")
	private String nombreInmueble;
	@Basic(optional = false)
	@Column(name = "descripcionI")
	private String descripcionI;
	@Basic(optional = false)
	@Column(name = "pesoInmueble")
	private float pesoInmueble;
	@Basic(optional = false)
	@Column(name = "altoInmueble")
	private float altoInmueble;
	@Basic(optional = false)
	@Column(name = "anchoInmueble")
	private float anchoInmueble;
	@Basic(optional = false)
	@Column(name = "largoInmueble")
	private float largoInmueble;
	@Basic(optional = false)
	@Column(name = "colorInmueble")
	private String colorInmueble;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroInternoI")
	private List<Datoscompra> datoscompraList;
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "numeroInternoI")
	private List<Asignacioninmueble> asignacioninmuebleList;
	@JoinColumn(name = "idTipo", referencedColumnName = "idTipoInmueble")
	@ManyToOne(optional = false)
	private Tipoinmueble idTipo;
	@JoinColumn(name = "idEstadoInmueble", referencedColumnName = "idEstadoInmueble")
	@ManyToOne(optional = false)
	private Estadoinmueble idEstadoInmueble;

	public Inmueble() {
	}

	public Inmueble(Integer numeroInternoI) {
		this.numeroInternoI = numeroInternoI;
	}

	public Inmueble(Integer numeroInternoI, String serialInmueble, String nombreInmueble, String descripcionI,
			float pesoInmueble, float altoInmueble, float anchoInmueble, float largoInmueble, String colorInmueble) {
		this.numeroInternoI = numeroInternoI;
		this.serialInmueble = serialInmueble;
		this.nombreInmueble = nombreInmueble;
		this.descripcionI = descripcionI;
		this.pesoInmueble = pesoInmueble;
		this.altoInmueble = altoInmueble;
		this.anchoInmueble = anchoInmueble;
		this.largoInmueble = largoInmueble;
		this.colorInmueble = colorInmueble;
	}

	public Integer getNumeroInternoI() {
		return numeroInternoI;
	}

	public void setNumeroInternoI(Integer numeroInternoI) {
		this.numeroInternoI = numeroInternoI;
	}

	public String getSerialInmueble() {
		return serialInmueble;
	}

	public void setSerialInmueble(String serialInmueble) {
		this.serialInmueble = serialInmueble;
	}

	public String getNombreInmueble() {
		return nombreInmueble;
	}

	public void setNombreInmueble(String nombreInmueble) {
		this.nombreInmueble = nombreInmueble;
	}

	public String getDescripcionI() {
		return descripcionI;
	}

	public void setDescripcionI(String descripcionI) {
		this.descripcionI = descripcionI;
	}

	public float getPesoInmueble() {
		return pesoInmueble;
	}

	public void setPesoInmueble(float pesoInmueble) {
		this.pesoInmueble = pesoInmueble;
	}

	public float getAltoInmueble() {
		return altoInmueble;
	}

	public void setAltoInmueble(float altoInmueble) {
		this.altoInmueble = altoInmueble;
	}

	public float getAnchoInmueble() {
		return anchoInmueble;
	}

	public void setAnchoInmueble(float anchoInmueble) {
		this.anchoInmueble = anchoInmueble;
	}

	public float getLargoInmueble() {
		return largoInmueble;
	}

	public void setLargoInmueble(float largoInmueble) {
		this.largoInmueble = largoInmueble;
	}

	public String getColorInmueble() {
		return colorInmueble;
	}

	public void setColorInmueble(String colorInmueble) {
		this.colorInmueble = colorInmueble;
	}

	public List<Datoscompra> getDatoscompraList() {
		return datoscompraList;
	}

	public void setDatoscompraList(List<Datoscompra> datoscompraList) {
		this.datoscompraList = datoscompraList;
	}

	public List<Asignacioninmueble> getAsignacioninmuebleList() {
		return asignacioninmuebleList;
	}

	public void setAsignacioninmuebleList(List<Asignacioninmueble> asignacioninmuebleList) {
		this.asignacioninmuebleList = asignacioninmuebleList;
	}

	public Tipoinmueble getIdTipo() {
		return idTipo;
	}

	public void setIdTipo(Tipoinmueble idTipo) {
		this.idTipo = idTipo;
	}

	public Estadoinmueble getIdEstadoInmueble() {
		return idEstadoInmueble;
	}

	public void setIdEstadoInmueble(Estadoinmueble idEstadoInmueble) {
		this.idEstadoInmueble = idEstadoInmueble;
	}

	@Override
	public int hashCode() {
		int hash = 0;
		hash += (numeroInternoI != null ? numeroInternoI.hashCode() : 0);
		return hash;
	}

	@Override
	public boolean equals(Object object) {
		// TODO: Warning - this method won't work in the case the id fields are not set
		if (!(object instanceof Inmueble)) {
			return false;
		}
		Inmueble other = (Inmueble) object;
		if ((this.numeroInternoI == null && other.numeroInternoI != null)
				|| (this.numeroInternoI != null && !this.numeroInternoI.equals(other.numeroInternoI))) {
			return false;
		}
		return true;
	}

	@Override
	public String toString() {
		return "mapeose.Inmueble[ numeroInternoI=" + numeroInternoI + " ]";
	}

}
