package com.test.websystems.components.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Entity for working with table in database
 * 
 * @author yagi
 *
 */
@Entity
@Table(name = "quadratic_equation")
public class QuadraticEquation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Integer id;

	@Column(name = "variable_a")
	private double variableA;

	@Column(name = "variable_b")
	private double variableB;

	@Column(name = "variable_c")
	private double variableC;

	@Column(name = "root_first")
	private Double rootFirst;

	@Column(name = "root_second")
	private Double rootSecond;

	@Column(name = "count_roots")
	private int countRoots;

	@Column(name = "message_for_user")
	private String messageForUser;

	public QuadraticEquation() {
	}

	public QuadraticEquation(double variableA, double variableB, double variableC, double rootFirst, double rootSecond,
			int countRoots, String messageForUser) {
		this.variableA = variableA;
		this.variableB = variableB;
		this.variableC = variableC;
		this.rootFirst = rootFirst;
		this.rootSecond = rootSecond;
		this.countRoots = countRoots;
		this.messageForUser = messageForUser;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public double getVariableA() {
		return variableA;
	}

	public void setVariableA(double variableA) {
		this.variableA = variableA;
	}

	public double getVariableB() {
		return variableB;
	}

	public void setVariableB(double variableB) {
		this.variableB = variableB;
	}

	public double getVariableC() {
		return variableC;
	}

	public void setVariableC(double variableC) {
		this.variableC = variableC;
	}

	public Double getRootFirst() {
		return rootFirst;
	}

	public void setRootFirst(Double rootFirst) {
		this.rootFirst = rootFirst;
	}

	public Double getRootSecond() {
		return rootSecond;
	}

	public void setRootSecond(Double rootSecond) {
		this.rootSecond = rootSecond;
	}

	public int getCountRoots() {
		return countRoots;
	}

	public void setCountRoots(int countRoots) {
		this.countRoots = countRoots;
	}

	public String getMessageForUser() {
		return messageForUser;
	}

	public void setMessageForUser(String messageForUser) {
		this.messageForUser = messageForUser;
	}

}
