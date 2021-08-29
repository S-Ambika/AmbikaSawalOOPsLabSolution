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
		final String chars = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";
		final String spChars = "@#$!";
		final String numbers = "0123456789";
		SecureRandom random = new SecureRandom();
		StringBuilder password = new StringBuilder();

		for (int i = 0; i < 4; i++) {
			int randomIndex_chars = random.nextInt(chars.length());
			password.append(chars.charAt(randomIndex_chars));
		}

		int randomIndex_spChar = random.nextInt(spChars.length());
		password.append(spChars.charAt(randomIndex_spChar));

		for (int i = 0; i < 3; i++) {
			int randomIndex_num = random.nextInt(numbers.length());
			password.append(numbers.charAt(randomIndex_num));
		}

		return password.toString();
	}

	@Override
	public String generateEmailAddress(String firstName, String lastName, String department) {

		// TODO Auto-generated method stub

		String email_id = firstName.toLowerCase() + lastName.toLowerCase() + "." + department + "@"
				+ Constants.companyName + ".com";

		return email_id;
	}

	@Override
	public String showCredentials(String firstName, String lastName, String password, String email) {
		// TODO Auto-generated method stub

		String show = "Dear " + firstName + " your generated credentials are as follows:\n Email --> " + email
				+ "\n Password --> " + password;

		return show;

	}

}
