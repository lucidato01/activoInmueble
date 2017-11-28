package com.co.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.jboss.logging.Logger;

import com.co.dao.IDaoPersona;
import com.co.modelo.Inmueble;
import com.co.modelo.Persona;

public class DaoPersona implements IDaoPersona {

	private Logger logger = Logger.getLogger(DaoPersona.class.getName());
	private EntityManager entityM;

	public DaoPersona() {
		logger.info("Inicia Dao Persona");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("activo");
		this.entityM = factory.createEntityManager();
	}

	@Override
	public List<Persona> listaPersona() {
		try {
			Session session = (Session) this.entityM.getDelegate();
			Criteria criteria = session.createCriteria(Persona.class);
			List<Persona> listaGeneral = criteria.list();
			return listaGeneral;
		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}
		
	
	}

}
