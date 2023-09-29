package com.edu.co.login.bcrypt;

public interface HashServiceI {
	
	String hashPassword(String password);
	
	boolean matchPasswords(String userPassword, String loginPassword);

}
