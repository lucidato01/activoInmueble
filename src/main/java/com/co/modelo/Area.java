package com.co.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 *
 * @author Fabian
 */
@Entity
@Table(name = "area")
@NamedQueries({
    @NamedQuery(name = "Area.findAll", query = "SELECT a FROM Area a")})
public class Area implements Serializable {

     
    /**
	 * 
	 */
	private static final long serialVersionUID = 8195525710300302216L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idArea")
    private Integer idArea;
    @Basic(optional = false)
    @Column(name = "nombreArea")
    private String nombreArea;
    @OneToMany(mappedBy = "idArea")
    private List<Asignacioninmueble> asignacioninmuebleList;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idArea")
    private List<Areaciudad> areaciudadList;

    public Area() {
    }

    public Area(Integer idArea) {
        this.idArea = idArea;
    }

    public Area(Integer idArea, String nombreArea) {
        this.idArea = idArea;
        this.nombreArea = nombreArea;
    }

    public Integer getIdArea() {
        return idArea;
    }

    public void setIdArea(Integer idArea) {
        this.idArea = idArea;
    }

    public String getNombreArea() {
        return nombreArea;
    }

    public void setNombreArea(String nombreArea) {
        this.nombreArea = nombreArea;
    }

    public List<Asignacioninmueble> getAsignacioninmuebleList() {
        return asignacioninmuebleList;
    }

    public void setAsignacioninmuebleList(List<Asignacioninmueble> asignacioninmuebleList) {
        this.asignacioninmuebleList = asignacioninmuebleList;
    }

    public List<Areaciudad> getAreaciudadList() {
        return areaciudadList;
    }

    public void setAreaciudadList(List<Areaciudad> areaciudadList) {
        this.areaciudadList = areaciudadList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idArea != null ? idArea.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Area)) {
            return false;
        }
        Area other = (Area) object;
        if ((this.idArea == null && other.idArea != null) || (this.idArea != null && !this.idArea.equals(other.idArea))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeose.Area[ idArea=" + idArea + " ]";
    }
    
}
