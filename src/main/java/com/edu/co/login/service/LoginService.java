package com.edu.co.login.service;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.co.login.dao.LoginDAO;
import com.edu.ue.model.Employee;

@Service
public class LoginService implements LoginServiceI {
	
	@Autowired
	LoginDAO dao;
	

	@Override
	public String login(Employee employee) {
		Employee user;
		if(dao.getEmployee(employee.getUsername()) != null) {
			
			user = dao.getEmployee(employee.getUsername());
			
			if(user.getPassword().equals(employee.getPassword())) {
				
				return "loggin";
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
		
		Pattern emailP = Pattern.compile("^[\\w-\\.]+@([\\w-]+\\.)+[\\w-]{2,4}$");
		Matcher emailM = emailP.matcher(employee.getEmail());
		
		Pattern usernameP = Pattern.compile("^(?=[a-zA-Z0-9._]{6,20}$)(?!.*[_.]{2})[^_.].*[^_.]$");
		Matcher usernameM = usernameP.matcher(employee.getUsername());
		
		Pattern fullnameP = Pattern.compile("^[a-zA-Z]{4,}(?: [a-zA-Z]+){0,2}$");
		Matcher fullnameM = fullnameP.matcher(employee.getFullname());
		
		
		if(!emailM.matches() || !fullnameM.matches() || !usernameM.matches() || employee.getPassword().isEmpty()) {
			
			return "Los campos no son validos";
			
		}
		
		
		else {
			if(dao.getEmployee(employee.getUsername()) != null) {
				return "El usuario ya existe";
				
			} else {
				Employee user = dao.createEmployee(employee);
				return "Usuario creado: "+user.getUsername();
			}
		}
			
	}
	

}
