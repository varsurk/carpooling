package org.daos;

// Generated Nov 1, 2015 12:47:06 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.pojos.Tripstatus;

/**
 * Home object for domain model class Tripstatus.
 * @see daos.Tripstatus
 * @author Hibernate Tools
 */
public class TripstatusHome {

	private static final Log log = LogFactory.getLog(TripstatusHome.class);

	private final SessionFactory sessionFactory = getSessionFactory();

	protected SessionFactory getSessionFactory() {
		try {
			return (SessionFactory) new InitialContext()
					.lookup("SessionFactory");
		} catch (Exception e) {
			log.error("Could not locate SessionFactory in JNDI", e);
			throw new IllegalStateException(
					"Could not locate SessionFactory in JNDI");
		}
	}

	public void persist(Tripstatus transientInstance) {
		log.debug("persisting Tripstatus instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Tripstatus instance) {
		log.debug("attaching dirty Tripstatus instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Tripstatus instance) {
		log.debug("attaching clean Tripstatus instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Tripstatus persistentInstance) {
		log.debug("deleting Tripstatus instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Tripstatus merge(Tripstatus detachedInstance) {
		log.debug("merging Tripstatus instance");
		try {
			Tripstatus result = (Tripstatus) sessionFactory.getCurrentSession()
					.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Tripstatus findById(java.lang.Integer id) {
		log.debug("getting Tripstatus instance with id: " + id);
		try {
			Tripstatus instance = (Tripstatus) sessionFactory
					.getCurrentSession().get("daos.Tripstatus", id);
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

	public List findByExample(Tripstatus instance) {
		log.debug("finding Tripstatus instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("daos.Tripstatus")
					.add(Example.create(instance)).list();
			log.debug("find by example successful, result size: "
					+ results.size());
			return results;
		} catch (RuntimeException re) {
			log.error("find by example failed", re);
			throw re;
		}
	}
}
