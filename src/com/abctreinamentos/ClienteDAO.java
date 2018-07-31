package com.abctreinamentos;
// Generated 29/07/2018 16:21:43 by Hibernate Tools 4.3.5.Final

import java.io.File;
import java.util.List;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Home object for domain model class Cliente.
 * @see com.abctreinamentos.Cliente
 * @author Hibernate Tools
 */
public class ClienteDAO {

	private static final Log log = LogFactory.getLog(ClienteDAO.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		SessionFactory sessionFactory = new Configuration().
				configure(new File("src/META-INF/hibernate.cfg.xml"))
				.buildSessionFactory();
				return sessionFactory;
	}

	public void persist(Cliente transientInstance) {
		log.debug("persisting Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.persist(transientInstance);
			session.getTransaction().commit();
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void delete(Cliente persistentInstance) {
		log.debug("deleting Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.delete(persistentInstance);
			session.getTransaction().commit();
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public void merge(Cliente detachedInstance) {
		log.debug("merging Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			session.persist(detachedInstance);
			session.getTransaction().commit();
			log.debug("merge successful");
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Cliente find(long cpf) {
		log.debug("getting Cliente instance");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			Cliente instance = (Cliente) sessionFactory.getCurrentSession().get("com.abctreinamento.Cliente", cpf);
			session.getTransaction().commit();		
			
			if (instance == null) {
				log.debug("get successful, no instance found");
			} else {	
				log.debug("get successful, instance found");
			}
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}

	public List<Cliente> findAll () {
		log.debug("getting All Clientes");
		try {
			Session session = sessionFactory.getCurrentSession();
			session.beginTransaction();
			// HQL
			session.getTransaction().commit();
		} catch (RuntimeException re) {
			log.error("getting All Clientes failed", re);
			throw re;
		}
		return null;
	}
	
}
