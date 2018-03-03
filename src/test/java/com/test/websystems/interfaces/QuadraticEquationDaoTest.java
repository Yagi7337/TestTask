package com.test.websystems.interfaces;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

import com.test.websystems.components.dao.QuadraticEquationDao;
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

	private IQuadraticEquation iQuadraticEquation;

	private QuadraticEquation quadraticEquation;

	private final double VARIABLE_A = 1;
	private final double VARIABLE_B = 1;
	private final double VARIABLE_C = 1;
	private final Double ROOT_FIRST = 1.1;
	private final Double ROOT_SECOND = 1.2;
	private final int COUNT_ROOTS = 3;
	private final String MESSAGE_FOR_USER = "TestMessage";

	private Integer quadraticEquationId;

	/**
	 * Create a test quadratic equation in the DB and remember value of id this
	 * equation for testing operations
	 */
	@Before
	public void prepareDate() {
		iQuadraticEquation = new QuadraticEquationDao();

		quadraticEquation = new QuadraticEquation();
		quadraticEquation.setVariableA(VARIABLE_A);
		quadraticEquation.setVariableB(VARIABLE_B);
		quadraticEquation.setVariableC(VARIABLE_C);

		quadraticEquation.setRootFirst(ROOT_FIRST);
		quadraticEquation.setRootSecond(ROOT_SECOND);

		quadraticEquation.setCountRoots(COUNT_ROOTS);
		quadraticEquation.setMessageForUser(MESSAGE_FOR_USER);

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
