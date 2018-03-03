package com.test.websystems.services;

import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.mock;

import org.junit.Before;
import org.junit.Test;

import com.test.websystems.components.entities.QuadraticEquation;
import com.test.websystems.components.interfaces.IQuadraticEquation;

/**
 * Test for сhecking the method call calculateRoots(quadraticEquation),
 * saveResult(quadraticEquation) and getResult(id) in method of class
 * {@link QuadraticEquationService} (saveResult(quadraticEquation) and
 * getResult(id))
 * 
 * @author yagi
 *
 */
public class QuadraticEquationServiceTest {

	private CalculateQuadraticRootsService mockCalculateQRService;

	private IQuadraticEquation mockIQE;

	private QuadraticEquationService toTestQEService;

	private final Integer QUADRATIC_EQUATION_ID = 1;

	/**
	 * Block for mock an instance of {@link CalculateQuadraticRootsService},
	 * {@link IQuadraticEquation} and spy the object being tested.
	 */
	@Before
	public void prepareDate() {
		mockCalculateQRService = mock(CalculateQuadraticRootsService.class);
		mockIQE = mock(IQuadraticEquation.class);

		toTestQEService = spy(new QuadraticEquationService());
	}

	/**
	 * Checking the methods calculateRoots(quadraticEquation) and
	 * saveResult(quadraticEquation) called in method saveResult(quadraticEquation)
	 * of {@link QuadraticEquationService}
	 */
	@Test
	public void checkCallsMethodInMethodSaveResult() {

		when(toTestQEService.getCalculateQuadraticRootsService()).thenReturn(mockCalculateQRService);
		when(toTestQEService.getIQuadraticEquation()).thenReturn(mockIQE);

		toTestQEService.saveResult(new QuadraticEquation());

		/*
		 * Check for method call: calculateRoots(quadraticEquation); with help
		 * getCalculateQuadraticRootsService().
		 */
		verify(toTestQEService).getCalculateQuadraticRootsService();

		/*
		 * Check for method call: saveResult(quadraticEquation); with help
		 * getIQuadraticEquation().
		 */
		verify(toTestQEService).getIQuadraticEquation();

	}

	/**
	 * Checking the methods calculateRoots(quadraticEquation) and
	 * saveResult(quadraticEquation) called in method saveResult(quadraticEquation)
	 * of {@link QuadraticEquationService}
	 */
	@Test
	public void checkCallsMethodInMethodGetResult() {

		when(toTestQEService.getIQuadraticEquation()).thenReturn(mockIQE);

		toTestQEService.getResult(QUADRATIC_EQUATION_ID);

		/*
		 * Check for method call: getResult(quadraticEquation); with help
		 * getIQuadraticEquation().
		 */
		verify(toTestQEService).getIQuadraticEquation();

	}
}
