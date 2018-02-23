package com.test.websystems.components.dao;

import org.apache.log4j.Logger;
import org.hibernate.Session;
import org.springframework.stereotype.Repository;

import com.test.websystems.components.entities.QuadraticEquation;
import com.test.websystems.components.interfaces.IQuadraticEquation;
import com.test.websystems.components.util.HibernateUtil;

/**
 * For save in database and get information from database. Specific layer for
 * database interaction
 * 
 * @author yagi
 *
 */
@Repository
public class QuadraticEquationDao implements IQuadraticEquation {

	private static final Logger LOGGER = Logger.getLogger(QuadraticEquationDao.class);

	/**
	 * Save data about quadratic equation in DB (create new record, not update)
	 * 
	 * @param quadraticEquation
	 */
	@Override
	public void saveResult(QuadraticEquation quadraticEquation) {
		Session session = HibernateUtil.getSessionFactory().openSession();

		session.beginTransaction();
		
		session.save(quadraticEquation);
		
		session.getTransaction().commit();

		LOGGER.info(String.format("Save | Quadratic equation, roots, message for user save id database. Id [%s].",
				quadraticEquation.getId()));
	}

	/**
	 * Get full information about quadratic equation (variables, roots, count of
	 * roots) from DB by id
	 * 
	 * @param id
	 * @return QuadraticEquation (object of entity)
	 */
	@Override
	public QuadraticEquation getResult(Integer id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		QuadraticEquation quadraticEquation = (QuadraticEquation) session.get(QuadraticEquation.class, id);

		LOGGER.info(String.format("Get | Quadratic equation, roots, message for user get from database. Id [%s].", id));
		return quadraticEquation;
	}

}
