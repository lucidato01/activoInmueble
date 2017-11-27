package com.co.modelo;



import java.io.Serializable;
import java.util.Date;
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
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
*
* @author Fabian
*/
@Entity
@Table(name = "datoscompra")
@NamedQueries({
   @NamedQuery(name = "Datoscompra.findAll", query = "SELECT d FROM Datoscompra d")})
public class Datoscompra implements Serializable {

    
   /**
	 * 
	 */
	private static final long serialVersionUID = 5960665075781196449L;
@Id
   @GeneratedValue(strategy = GenerationType.IDENTITY)
   @Basic(optional = false)
   @Column(name = "idDC")
   private Integer idDC;
   @Basic(optional = false)
   @Column(name = "valorCompra")
   private float valorCompra;
   @Basic(optional = false)
   @Column(name = "fechaCompra")
   @Temporal(TemporalType.DATE)
   private Date fechaCompra;
   @Basic(optional = false)
   @Column(name = "fechaDebaja")
   @Temporal(TemporalType.DATE)
   private Date fechaDebaja;
   @JoinColumn(name = "numeroInternoI", referencedColumnName = "numeroInternoI")
   @ManyToOne(optional = false)
   private Inmueble numeroInternoI;

   public Datoscompra() {
   }

   public Datoscompra(Integer idDC) {
       this.idDC = idDC;
   }

   public Datoscompra(Integer idDC, float valorCompra, Date fechaCompra, Date fechaDebaja) {
       this.idDC = idDC;
       this.valorCompra = valorCompra;
       this.fechaCompra = fechaCompra;
       this.fechaDebaja = fechaDebaja;
   }

   public Integer getIdDC() {
       return idDC;
   }

   public void setIdDC(Integer idDC) {
       this.idDC = idDC;
   }

   public float getValorCompra() {
       return valorCompra;
   }

   public void setValorCompra(float valorCompra) {
       this.valorCompra = valorCompra;
   }

   public Date getFechaCompra() {
       return fechaCompra;
   }

   public void setFechaCompra(Date fechaCompra) {
       this.fechaCompra = fechaCompra;
   }

   public Date getFechaDebaja() {
       return fechaDebaja;
   }

   public void setFechaDebaja(Date fechaDebaja) {
       this.fechaDebaja = fechaDebaja;
   }

   public Inmueble getNumeroInternoI() {
       return numeroInternoI;
   }

   public void setNumeroInternoI(Inmueble numeroInternoI) {
       this.numeroInternoI = numeroInternoI;
   }

   @Override
   public int hashCode() {
       int hash = 0;
       hash += (idDC != null ? idDC.hashCode() : 0);
       return hash;
   }

   @Override
   public boolean equals(Object object) {
       // TODO: Warning - this method won't work in the case the id fields are not set
       if (!(object instanceof Datoscompra)) {
           return false;
       }
       Datoscompra other = (Datoscompra) object;
       if ((this.idDC == null && other.idDC != null) || (this.idDC != null && !this.idDC.equals(other.idDC))) {
           return false;
       }
       return true;
   }

   @Override
   public String toString() {
       return "mapeose.Datoscompra[ idDC=" + idDC + " ]";
   }
   
}
