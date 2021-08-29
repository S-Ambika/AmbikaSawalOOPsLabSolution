package com.greatLearning.OOPsLabSolution.main;

import java.util.Scanner;

import com.greatLearning.OOPsLabSolution.model.Employee;
import com.greatLearning.OOPsLabSolution.service.CredentialServiceImpl;

/*
 * To call the methods implemented by CredentialServiceImpl and get the desired output
 */
public class Main {



	public static void main(String[] args) {
		// TODO Auto-generated method stub
boolean flag=false;
Scanner user_input = new Scanner(System.in);

		/*
		 * To get User Input for Employee's name
		 */

		System.out.println("Please Enter your First Name");

		String firstName = user_input.next();

		System.out.println("Please Enter your Last Name");

		String lastName = user_input.next();

		/*
		 * Passing Employee's name using parameterized constructor of EMployee class
		 */

		Employee employee = new Employee(firstName, lastName);
		flag=true;

		while(flag) {
		System.out.println(
				"Please Enter the Department from the following\n1. Technical\n2. Admin\n3. Human Resource\n4. Legal");
		
		int option = user_input.nextInt();

		/*
		 * Showing Credentials according to selected option by user
		 */

		switch (option) {

		case 1:

			GenerateCred(employee.getFirstName(), employee.getLastName(), "tech");
			flag=false;

			user_input.close();
			break;

		case 2:
			GenerateCred(employee.getFirstName(), employee.getLastName(), "admin");
			flag=false;

			user_input.close();
			break;

		case 3:
			GenerateCred(employee.getFirstName(), employee.getLastName(), "hr");
			flag=false;

			user_input.close();
			break;

		case 4:

			GenerateCred(employee.getFirstName(), employee.getLastName(), "legal");
			flag=false;
			user_input.close();
			
			break;

		default:

			System.out.println("Please select valid option");
			flag=true;

			break;
		}
		}
	}

	/*
	 * Method to invoke CredentialServiceImpl class's method by creating its object
	 * Parameterized method to get all the required values
	 */
	public static void GenerateCred(String firstName, String lastName, String department) {
		CredentialServiceImpl credentialServiceImpl = new CredentialServiceImpl();
		String password = credentialServiceImpl.generatePassword();
		String email = credentialServiceImpl.generateEmailAddress(firstName, lastName, department);

		if (password != null) {
			credentialServiceImpl.showCredentials(firstName, lastName, password, email);
		}
	}
}
