package com.test.websystems.components.dao;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.test.websystems.components.entities.QuadraticEquation;
import com.test.websystems.components.interfaces.IQuadraticEquation;

/**
 * Test for the interface (IQuadraticEquation) implemented by the class
 * (QuadraticEquationDao)
 * 
 * @author yagi
 *
 */
public class QuadraticEquationDaoTest {

	@Autowired
	private IQuadraticEquation iQuadraticEquation;

	private QuadraticEquation quadraticEquation;

	private Integer quadraticEquationId;

	/**
	 * Create a test quadratic equation in the DB and remember value of id this
	 * equation for testing operations
	 */
	@Before
	public void prepareDate() {
		quadraticEquation = new QuadraticEquation();
		quadraticEquation.setVariableA(1);
		quadraticEquation.setVariableB(1);
		quadraticEquation.setVariableC(1);

		quadraticEquation.setRootFirst(1.1);
		quadraticEquation.setRootSecond(1.2);

		quadraticEquation.setCountRoots(2);
		quadraticEquation.setMessageForUser("TestMessage");

		quadraticEquationId = iQuadraticEquation.saveResult(quadraticEquation);

	}

	/**
	 * Get result information about quadratic equation (by id) from database for the
	 * object that was recorded before. |Test on save and get in databases|
	 */
	@Test
	public void saveResult() {
		assertEquals(iQuadraticEquation.getResult(quadraticEquationId), quadraticEquation);
	}

}
