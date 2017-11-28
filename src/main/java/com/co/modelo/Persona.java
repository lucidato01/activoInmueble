package com.co.modelo;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
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
@Table(name = "persona")
@NamedQueries({
    @NamedQuery(name = "Persona.findAll", query = "SELECT p FROM Persona p")})
public class Persona implements Serializable {

    
    /**
	 * 
	 */
	private static final long serialVersionUID = 7868690480557217398L;
	@Id
    @Basic(optional = false)
    @Column(name = "cedulaPersona")
    private String cedulaPersona;
    @Basic(optional = false)
    @Column(name = "nombresPersona")
    private String nombresPersona;
    @OneToMany(mappedBy = "cedulaPersona")
    private List<Asignacioninmueble> asignacioninmuebleList;

    public Persona() {
    }

    public Persona(String cedulaPersona) {
        this.cedulaPersona = cedulaPersona;
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

    public List<Asignacioninmueble> getAsignacioninmuebleList() {
        return asignacioninmuebleList;
    }

    public void setAsignacioninmuebleList(List<Asignacioninmueble> asignacioninmuebleList) {
        this.asignacioninmuebleList = asignacioninmuebleList;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cedulaPersona != null ? cedulaPersona.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Persona)) {
            return false;
        }
        Persona other = (Persona) object;
        if ((this.cedulaPersona == null && other.cedulaPersona != null) || (this.cedulaPersona != null && !this.cedulaPersona.equals(other.cedulaPersona))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "mapeose.Persona[ cedulaPersona=" + cedulaPersona + " ]";
    }
    
}
