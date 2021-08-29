package com.greatLearning.OOPsLabSolution.model;

/*
 * Using Encapsulation
 * Pojo class for getting and setting firstName and lastName from user
 * Also can be hardcoded if not asking from user
 */

public class Employee {

	private String firstName, lastName;

	/*
	 * Parameterized Constructor to pass firstName & lastName
	 */
	public Employee(String firstName, String lastName) {

		this.firstName = firstName;
		this.lastName = lastName;

	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
