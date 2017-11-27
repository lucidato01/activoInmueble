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
@Table(name = "tipoinmueble")
@NamedQueries({
   @NamedQuery(name = "Tipoinmueble.findAll", query = "SELECT t FROM Tipoinmueble t")})
public class Tipoinmueble implements Serializable {

    
   /**
	 * 
	 */
	private static final long serialVersionUID = -6228030887229056376L;
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "idTipoInmueble")
   private Integer idTipoInmueble;
   @Basic(optional = false)
   @Column(name = "descripcionTipo")
   private String descripcionTipo;
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "idTipo")
   private List<Inmueble> inmuebleList;

   public Tipoinmueble() {
   }

   public Tipoinmueble(Integer idTipoInmueble) {
       this.idTipoInmueble = idTipoInmueble;
   }

   public Tipoinmueble(Integer idTipoInmueble, String descripcionTipo) {
       this.idTipoInmueble = idTipoInmueble;
       this.descripcionTipo = descripcionTipo;
   }

   public Integer getIdTipoInmueble() {
       return idTipoInmueble;
   }

   public void setIdTipoInmueble(Integer idTipoInmueble) {
       this.idTipoInmueble = idTipoInmueble;
   }

   public String getDescripcionTipo() {
       return descripcionTipo;
   }

   public void setDescripcionTipo(String descripcionTipo) {
       this.descripcionTipo = descripcionTipo;
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
       hash += (idTipoInmueble != null ? idTipoInmueble.hashCode() : 0);
       return hash;
   }

   @Override
   public boolean equals(Object object) {
       // TODO: Warning - this method won't work in the case the id fields are not set
       if (!(object instanceof Tipoinmueble)) {
           return false;
       }
       Tipoinmueble other = (Tipoinmueble) object;
       if ((this.idTipoInmueble == null && other.idTipoInmueble != null) || (this.idTipoInmueble != null && !this.idTipoInmueble.equals(other.idTipoInmueble))) {
           return false;
       }
       return true;
   }

   @Override
   public String toString() {
       return "mapeose.Tipoinmueble[ idTipoInmueble=" + idTipoInmueble + " ]";
   }
   
}

