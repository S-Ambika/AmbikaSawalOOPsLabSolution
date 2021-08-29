package com.greatLearning.OOPsLabSolution.service;

import java.security.SecureRandom;

import com.greatLearning.OOPsLabSolution.util.Constants;

/*
 * Implemeting methods of interface according to requirement
 */

public class CredentialServiceImpl implements ICredentialService {

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789@#$!";

		SecureRandom random = new SecureRandom();
		StringBuilder password = new StringBuilder();

		for (int i = 0; i < 8; i++) {
			int randomIndex = random.nextInt(chars.length());
			password.append(chars.charAt(randomIndex));

		}
		return password.toString();
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {

		// TODO Auto-generated method stub

		String email_id = firstName + lastName + "@" + department + "." + Constants.companyName + ".com";

		return email_id;
	}

	@Override
	public void showCredentials(String firstName, String lastName, String password, String email) {
		// TODO Auto-generated method stub

		System.out.println("Dear " + firstName + " your credentials are as follows:\n Email --> " + email
				+ "\n Password --> " + password);

	}

}
