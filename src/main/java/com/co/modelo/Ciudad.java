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
@Table(name = "ciudad")
@NamedQueries({
@NamedQuery(name = "Ciudad.findAll", query = "SELECT c FROM Ciudad c")})
public class Ciudad implements Serializable {

    
   /**
	 * 
	 */
	private static final long serialVersionUID = 4705943343956628956L;
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "idCiudad")
   private Integer idCiudad;
   @Basic(optional = false)
   @Column(name = "nombreCiudad")
   private String nombreCiudad;
   @OneToMany(cascade = CascadeType.ALL, mappedBy = "idCiudad")
   private List<Areaciudad> areaciudadList;

   public Ciudad() {
   }

   public Ciudad(Integer idCiudad) {
       this.idCiudad = idCiudad;
   }

   public Ciudad(Integer idCiudad, String nombreCiudad) {
       this.idCiudad = idCiudad;
       this.nombreCiudad = nombreCiudad;
   }

   public Integer getIdCiudad() {
       return idCiudad;
   }

   public void setIdCiudad(Integer idCiudad) {
       this.idCiudad = idCiudad;
   }

   public String getNombreCiudad() {
       return nombreCiudad;
   }

   public void setNombreCiudad(String nombreCiudad) {
       this.nombreCiudad = nombreCiudad;
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
       hash += (idCiudad != null ? idCiudad.hashCode() : 0);
       return hash;
   }

   @Override
   public boolean equals(Object object) {
       // TODO: Warning - this method won't work in the case the id fields are not set
       if (!(object instanceof Ciudad)) {
           return false;
       }
       Ciudad other = (Ciudad) object;
       if ((this.idCiudad == null && other.idCiudad != null) || (this.idCiudad != null && !this.idCiudad.equals(other.idCiudad))) {
           return false;
       }
       return true;
   }

   @Override
   public String toString() {
       return "mapeose.Ciudad[ idCiudad=" + idCiudad + " ]";
   }
   
}
