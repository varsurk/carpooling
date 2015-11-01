package org.daos;

// Generated Nov 1, 2015 12:47:06 AM by Hibernate Tools 3.4.0.CR1

import java.util.List;

import javax.naming.InitialContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.hibernate.LockMode;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Example;
import org.pojos.Reviewratings;

/**
 * Home object for domain model class Reviewratings.
 * @see daos.Reviewratings
 * @author Hibernate Tools
 */
public class ReviewratingsHome {

	private static final Log log = LogFactory.getLog(ReviewratingsHome.class);

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

	public void persist(Reviewratings transientInstance) {
		log.debug("persisting Reviewratings instance");
		try {
			sessionFactory.getCurrentSession().persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void attachDirty(Reviewratings instance) {
		log.debug("attaching dirty Reviewratings instance");
		try {
			sessionFactory.getCurrentSession().saveOrUpdate(instance);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void attachClean(Reviewratings instance) {
		log.debug("attaching clean Reviewratings instance");
		try {
			sessionFactory.getCurrentSession().lock(instance, LockMode.NONE);
			log.debug("attach successful");
		} catch (RuntimeException re) {
			log.error("attach failed", re);
			throw re;
		}
	}

	public void delete(Reviewratings persistentInstance) {
		log.debug("deleting Reviewratings instance");
		try {
			sessionFactory.getCurrentSession().delete(persistentInstance);
			log.debug("delete successful");
		} catch (RuntimeException re) {
			log.error("delete failed", re);
			throw re;
		}
	}

	public Reviewratings merge(Reviewratings detachedInstance) {
		log.debug("merging Reviewratings instance");
		try {
			Reviewratings result = (Reviewratings) sessionFactory
					.getCurrentSession().merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Reviewratings findById(java.lang.Integer id) {
		log.debug("getting Reviewratings instance with id: " + id);
		try {
			Reviewratings instance = (Reviewratings) sessionFactory
					.getCurrentSession().get("daos.Reviewratings", id);
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

	public List findByExample(Reviewratings instance) {
		log.debug("finding Reviewratings instance by example");
		try {
			List results = sessionFactory.getCurrentSession()
					.createCriteria("daos.Reviewratings")
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
