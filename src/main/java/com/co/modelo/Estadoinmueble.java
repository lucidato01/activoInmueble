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
@Table(name = "estadoinmueble")
@NamedQueries({
    @NamedQuery(name = "Estadoinmueble.findAll", query = "SELECT e FROM Estadoinmueble e")})
public class Estadoinmueble implements Serializable {

     
    /**
	 * 
	 */
	private static final long serialVersionUID = 4532753862036829084L;
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "idEstadoInmueble")
    private Integer idEstadoInmueble;
    @Basic(optional = false)
    @Column(name = "descripcionEstado")
    private String descripcionEstado;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "idEstadoInmueble")
    private List<Inmueble> inmuebleList;

    public Estadoinmueble() {
    }

    public Estadoinmueble(Integer idEstadoInmueble) {
        this.idEstadoInmueble = idEstadoInmueble;
    }

    public Estadoinmueble(Integer idEstadoInmueble, String descripcionEstado) {
        this.idEstadoInmueble = idEstadoInmueble;
        this.descripcionEstado = descripcionEstado;
    }

    public Integer getIdEstadoInmueble() {
        return idEstadoInmueble;
    }

    public void setIdEstadoInmueble(Integer idEstadoInmueble) {
        this.idEstadoInmueble = idEstadoInmueble;
    }

    public String getDescripcionEstado() {
        return descripcionEstado;
    }

    public void setDescripcionEstado(String descripcionEstado) {
        this.descripcionEstado = descripcionEstado;
    }

    public List<Inmueble> getInmuebleList() {
        return inmuebleList;
    }

    public void setInmuebleList(List<Inmueble> inmuebleList) {
        this.inmuebleList = inmuebleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idEstadoInmueble != null ? idEstadoInmueble.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Estadoinmueble)) {
            return false;
        }
        Estadoinmueble other = (Estadoinmueble) object;
        if ((this.idEstadoInmueble == null && other.idEstadoInmueble != null) || (this.idEstadoInmueble != null && !this.idEstadoInmueble.equals(other.idEstadoInmueble))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeose.Estadoinmueble[ idEstadoInmueble=" + idEstadoInmueble + " ]";
    }
    
}
