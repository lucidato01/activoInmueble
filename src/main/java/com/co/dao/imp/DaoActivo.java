package com.co.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.jboss.logging.Logger;

import com.co.dao.IDaoActivo;
import com.co.modelo.Inmueble;

public class DaoActivo implements IDaoActivo {

	private Logger logger = Logger.getLogger(DaoActivo.class.getName());
	private EntityManager entityM;

	public DaoActivo() {
		logger.info("Inicia Dao Activo");
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("activo");
		this.entityM = factory.createEntityManager();
	}

	@Override
	public List<Inmueble> listaActivosGeneral() {
		try {
			Session session = (Session) this.entityM.getDelegate();
			Criteria criteria = session.createCriteria(Inmueble.class);
			List<Inmueble> listaGeneral = criteria.list();
			return listaGeneral;

		} catch (Exception e) {
			// TODO: handle exception
			return null;
		}

		
	}

}
