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
@Table(name = "areaciudad")
@NamedQueries({
    @NamedQuery(name = "Areaciudad.findAll", query = "SELECT a FROM Areaciudad a")})
public class Areaciudad implements Serializable {

     
    /**
	 * 
	 */
	private static final long serialVersionUID = -8579413330118231791L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idAreaCiudad")
    private Integer idAreaCiudad;
    @JoinColumn(name = "idCiudad", referencedColumnName = "idCiudad")
    @ManyToOne(optional = false)
    private Ciudad idCiudad;
    @JoinColumn(name = "idArea", referencedColumnName = "idArea")
    @ManyToOne(optional = false)
    private Area idArea;

    public Areaciudad() {
    }

    public Areaciudad(Integer idAreaCiudad) {
        this.idAreaCiudad = idAreaCiudad;
    }

    public Integer getIdAreaCiudad() {
        return idAreaCiudad;
    }

    public void setIdAreaCiudad(Integer idAreaCiudad) {
        this.idAreaCiudad = idAreaCiudad;
    }

    public Ciudad getIdCiudad() {
        return idCiudad;
    }

    public void setIdCiudad(Ciudad idCiudad) {
        this.idCiudad = idCiudad;
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
        hash += (idAreaCiudad != null ? idAreaCiudad.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Areaciudad)) {
            return false;
        }
        Areaciudad other = (Areaciudad) object;
        if ((this.idAreaCiudad == null && other.idAreaCiudad != null) || (this.idAreaCiudad != null && !this.idAreaCiudad.equals(other.idAreaCiudad))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeose.Areaciudad[ idAreaCiudad=" + idAreaCiudad + " ]";
    }
    
}
