package com.test.websystems.services;

import org.springframework.stereotype.Service;

import com.test.websystems.components.entities.QuadraticEquation;

/**
 * Service for calculate roots, discriminant, count of roots quadratic equation.
 * 
 * @author yagi
 *
 */
@Service
public class CalculateQuadraticRootsService {

	private final static String MESSAGE_FOR_USER_EQUATION_IS_NOT_QUADRATIC = "Уравнение не является квадратным. Потому, что a == 0";

	private final static String MESSAGE_FOR_USER_POSITIVE_DISKRIMINANT = "Квадратное уравнение имеет два корня. Дискриминант > 0.";

	private final static String MESSAGE_FOR_USER_NULL_DISKRIMINANT = "Квадратное уравнение имеет один корень. Дискриминант = 0.";

	private final static String MESSAGE_FOR_USER_NEGATIVE_DISKRIMINANT = "Квадратное уравнение не имеет корней. Дискриминант < 0.";

	/**
	 * Calculate roots, discriminant, count of roots quadratic equation. Uses
	 * private method in class (for calculate discriminant, and a way to calculate
	 * the roots)
	 * 
	 * @param quadraticEquation
	 */
	public void calculateRoots(QuadraticEquation quadraticEquation) {
		if (quadraticEquation.getVariableA() == 0) {
			quadraticEquation.setMessageForUser(MESSAGE_FOR_USER_EQUATION_IS_NOT_QUADRATIC);
			return;
		}

		double discriminant = calculateDiscriminant(quadraticEquation);

		if (discriminant > 0) {
			calculateRootsForPositiveDiscriminant(quadraticEquation, discriminant);

		} else if (discriminant == 0) {
			calculateRootsForNullDiscriminant(quadraticEquation, discriminant);

		} else {
			messageForUserWhenNegativeDiscriminant(quadraticEquation);
		}

	}

	/**
	 * Calculate discriminant for quadratic equation (using variables: variableA,
	 * variableB, variableC)
	 * 
	 * @param quadraticEquation
	 * @return discriminant
	 */
	public double calculateDiscriminant(QuadraticEquation quadraticEquation) {

		return Math.pow(quadraticEquation.getVariableB(), 2)
				- 4 * quadraticEquation.getVariableA() * quadraticEquation.getVariableC();
	}

	/**
	 * Calculate the roots of quadratic equation when has two roots ! Use only where
	 * discriminant > 0 ! (checking with if or other or in a different way) Also set
	 * count of roots (countRoots = 2).
	 * 
	 * @param quadraticEquation
	 * @param discriminant
	 */
	private void calculateRootsForPositiveDiscriminant(QuadraticEquation quadraticEquation, double discriminant) {
		quadraticEquation.setRootFirst(
				(-quadraticEquation.getVariableB() + Math.sqrt(discriminant)) / (2 * quadraticEquation.getVariableA()));

		quadraticEquation.setRootSecond(
				(-quadraticEquation.getVariableB() - Math.sqrt(discriminant)) / (2 * quadraticEquation.getVariableA()));

		quadraticEquation.setCountRoots(2);

		quadraticEquation.setMessageForUser(MESSAGE_FOR_USER_POSITIVE_DISKRIMINANT);
	}

	/**
	 * Calculate the roots of quadratic equation when has two roots ! Use only where
	 * discriminant = 0 ! (checking with if or other or in a different way) Also set
	 * count of roots (countRoots = 1).
	 * 
	 * @param quadraticEquation
	 * @param discriminant
	 */
	private void calculateRootsForNullDiscriminant(QuadraticEquation quadraticEquation, double discriminant) {
		quadraticEquation.setRootFirst(-quadraticEquation.getVariableB() / (2 * quadraticEquation.getVariableA()));

		quadraticEquation.setCountRoots(1);

		quadraticEquation.setMessageForUser(MESSAGE_FOR_USER_NULL_DISKRIMINANT);
	}

	/**
	 * Get info for user that quadratic equation has negative discriminant and
	 * hasn't roots
	 * 
	 * @param quadraticEquation
	 */
	private void messageForUserWhenNegativeDiscriminant(QuadraticEquation quadraticEquation) {
		quadraticEquation.setMessageForUser(MESSAGE_FOR_USER_NEGATIVE_DISKRIMINANT);
	}

}
