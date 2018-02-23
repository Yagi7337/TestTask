package com.test.websystems.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.test.websystems.components.entities.QuadraticEquation;
import com.test.websystems.components.interfaces.IQuadraticEquation;

/**
 * Service for working with save and get result about quadratic equation. Is
 * used in the controller
 * 
 * @author yagi
 *
 */
@Service
public class QuadraticEquationService {

	@Autowired
	private CalculateQuadraticRootsService calculateQuadraticRootsService;

	@Autowired
	private IQuadraticEquation iQuadraticEquation;

	/**
	 * Save data about quadratic equation in DB (create new record, not update).
	 * Also call service for calculate roots, count of roots quadratic equation.
	 * After calculate save object in db with this information.
	 * 
	 * @param quadraticEquation
	 */
	public void saveResult(QuadraticEquation quadraticEquation) {
		calculateQuadraticRootsService.calculateRoots(quadraticEquation);
		iQuadraticEquation.saveResult(quadraticEquation);
	};

	/**
	 * Get full information about quadratic equation (variables, roots, count of
	 * roots) from DB by id
	 * 
	 * @param id
	 * @return QuadraticEquation (object of entity)
	 */
	public QuadraticEquation getResult(Integer id) {
		return iQuadraticEquation.getResult(id);
	};

}
