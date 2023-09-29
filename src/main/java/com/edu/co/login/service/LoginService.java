package com.edu.co.login.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.co.login.bcrypt.HashService;
import com.edu.co.login.dao.LoginDAO;
import com.edu.ue.model.Employee;

@Service
public class LoginService implements LoginServiceI {
	
	@Autowired
	LoginDAO dao;
	HashService newHash = new HashService();
	

	@Override
	public String login(Employee employee) {
		Employee user;
		if(dao.getEmployee(employee.getUsername()) != null) {
			
			user = dao.getEmployee(employee.getUsername());
			
			if(newHash.matchPasswords(user.getPassword(), employee.getPassword())) {
				
				return null;
			}
			else {
				return "Passwords no son iguales";
			}
			
			
		} else {
			return "Usuario no encontrado";
		}
		
	}

	@Override
	public String newEmployee(Employee employee) {
		
		if(dao.getEmployee(employee.getUsername()) != null) {
			
			return "El usuario ya existe";
			
		} else {
			
			employee.setPassword(this.newHash.hashPassword(employee.getPassword()));
			Employee user = dao.createEmployee(employee);
			
			return null;
			
		}
		
	}
}
