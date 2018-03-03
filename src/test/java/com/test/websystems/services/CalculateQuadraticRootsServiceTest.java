package com.test.websystems.services;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;

import org.junit.Before;
import org.junit.Test;

import com.test.websystems.components.entities.QuadraticEquation;
import com.test.websystems.components.interfaces.IQuadraticEquation;

/**
 * Test for сhecking the method call calculateDiscriminant(quadraticEquation) in
 * method of class {@link CalculateQuadraticRootsService}
 * (calculateRoots(quadraticEquation))
 * 
 * @author yagi
 *
 */
public class CalculateQuadraticRootsServiceTest {

	private CalculateQuadraticRootsService mockCalculateQRService;

	private QuadraticEquation quadraticEquation;

	private final double VARIABLE_A = 1;
	private final double VARIABLE_B = 7;
	private final double VARIANLE_C = 5;

	/**
	 * Block for mock an instance of {@link CalculateQuadraticRootsService},
	 * {@link IQuadraticEquation} and spy the object being tested.
	 */
	@Before
	public void prepareDate() {
		quadraticEquation = new QuadraticEquation();
		quadraticEquation.setVariableA(VARIABLE_A);
		quadraticEquation.setVariableB(VARIABLE_B);
		quadraticEquation.setVariableC(VARIANLE_C);

		mockCalculateQRService = spy(CalculateQuadraticRootsService.class);
	}

	/**
	 * Checking the methods calculateDiscriminant(quadraticEquation) called in
	 * method calculateRoots(quadraticEquation) of
	 * {@link CalculateQuadraticRootsService}
	 */
	@Test
	public void checkCallsMethodInMethodSaveResult() {

		mockCalculateQRService.calculateRoots(quadraticEquation);

		verify(mockCalculateQRService).calculateDiscriminant(quadraticEquation);

	}

}
