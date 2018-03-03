package com.test.websystems.components.interfaces;

import com.test.websystems.components.entities.QuadraticEquation;

/**
 * Interface for save in database and get information from database
 * 
 * @author yagi
 *
 */
public interface IQuadraticEquation {

	/**
	 * Save data about quadratic equation in DB (create new record, not update)
	 * 
	 * @param quadraticEquation
	 * @return 
	 */
	public Integer saveResult(QuadraticEquation quadraticEquation);

	/**
	 * Get full information about quadratic equation (variables, roots, count of
	 * roots) from DB by id
	 * 
	 * @param id
	 * @return QuadraticEquation (object of entity)
	 */
	public QuadraticEquation getResult(Integer id);

}
