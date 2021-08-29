package com.greatLearning.OOPsLabSolution.service;

public interface ICredentialService {

	String generatePassword();
	String generateEmailAddress(String firstName,String lastName,String department);
	void showCredentials(String firstName,String lastName,String password,String email);
}
