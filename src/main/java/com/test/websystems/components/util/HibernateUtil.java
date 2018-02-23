package com.test.websystems.components.util;

import org.apache.log4j.Logger;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Working with session for access to db
 * 
 * @author yagi
 *
 */
public class HibernateUtil {

	private static final Logger LOGGER = Logger.getLogger(HibernateUtil.class);

	private static SessionFactory sessionFactory = buildSessionFactory();

	/**
	 * Create the SessionFactory from hibernate.cfg.xml
	 * 
	 * @return
	 */
	private static SessionFactory buildSessionFactory() {
		try {
			return new Configuration().configure().buildSessionFactory();

		} catch (Throwable ex) {
			LOGGER.error("ERROR | Initial SessionFactory creation failed.");

			throw new ExceptionInInitializerError(ex);
		}
	}

	public static SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	/**
	 * Close caches and connection pools
	 */
	public static void shutdown() {
		getSessionFactory().close();

		LOGGER.info("Close caches and connection pools.");
	}

}
