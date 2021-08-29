package com.greatLearning.OOPsLabSolution.service;

import com.greatLearning.OOPsLabSolution.util.Constants;

public class CredentialServiceImpl implements ICredentialService{

	@Override
	public String generatePassword() {
		// TODO Auto-generated method stub
		
		return null;
	}

	@Override
	public String generateEmailAddress(String firstName,String lastName,String department) {
		
		// TODO Auto-generated method stub
		
		String email_id= firstName+lastName+"@"+department+"."+Constants.companyName+".com";
		 
		return email_id;
	}

	@Override
	public void showCredentials(String firstName,String lastName,String password,String email) {
		// TODO Auto-generated method stub
	
		System.out.println("Dear "+firstName+" your credentials are as follows:\n Email --> "+email+"\n Password --> "+password);		
				
	}

}
