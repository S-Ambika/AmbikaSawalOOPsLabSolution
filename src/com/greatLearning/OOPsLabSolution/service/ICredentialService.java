package com.greatLearning.OOPsLabSolution.service;

public interface ICredentialService {

	/*
	 * interface having Services that will be implemnted by its sub class
	 */

	String generatePassword();

	String generateEmailAddress(String firstName, String lastName, String department);

	String showCredentials(String firstName, String lastName, String password, String email);
}
