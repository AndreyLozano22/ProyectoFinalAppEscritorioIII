package com.edu.co.login.bcrypt;

import org.springframework.security.crypto.bcrypt.BCrypt;

public class HashService implements HashServiceI {

	@Override
	public String hashPassword(String password) {
		// Using bcrypt to hash the password
		return BCrypt.hashpw(password, BCrypt.gensalt());
	}

	@Override
	public boolean matchPasswords(String userPassword, String loginPassword) {
		// Using bcrypt to match user password, with the password coming from login
		return BCrypt.checkpw(loginPassword, userPassword);
	}

}
