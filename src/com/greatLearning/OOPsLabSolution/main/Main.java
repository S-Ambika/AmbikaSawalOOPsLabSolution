package com.greatLearning.OOPsLabSolution.main;

import java.util.Scanner;

import com.greatLearning.OOPsLabSolution.model.Employee;
import com.greatLearning.OOPsLabSolution.service.CredentialServiceImpl;

public class Main {

	CredentialServiceImpl credentialServiceImpl;
	Employee employee;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner user_input = new Scanner(System.in);
		System.out.println("Please Enter your First Name");

		String firstName = user_input.next();

		System.out.println("Please Enter your Last Name");

		String lastName = user_input.next();

		if(firstName!=null && lastName!=null) {
		
		Employee employee = new Employee(firstName, lastName);

		System.out.println(
				"Please Enter the Department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");

		int option = user_input.nextInt();
		
		switch(option) {
		
		case 1:
			
			GenerateCred(employee.getFirstName(),employee.getLastName(),"Technical");
			user_input.close();
			break;
			
		case 2:
			GenerateCred(employee.getFirstName(),employee.getLastName(),"Admin");
			user_input.close();
			break;
			
		case 3:
			GenerateCred(employee.getFirstName(),employee.getLastName(),"Human Resource");
			user_input.close();
			break;
			
		case 4:
			
			GenerateCred(employee.getFirstName(),employee.getLastName(),"Legal");
			user_input.close();
			break;
			
		default:
			
			break;
		}
		}
		else {
			
		}
	}

	public static void GenerateCred(String firstName,String lastName,String department) {
		CredentialServiceImpl credentialServiceImpl = new CredentialServiceImpl();

		String email= credentialServiceImpl.generateEmailAddress(firstName, lastName, department);
		String password= credentialServiceImpl.generatePassword();

		credentialServiceImpl.showCredentials(firstName, lastName, password, email);
		
	}
}
