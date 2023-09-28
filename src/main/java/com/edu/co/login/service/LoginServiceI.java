package com.edu.co.login.service;

import com.edu.ue.model.Employee;

public interface LoginServiceI {
	
	String login(Employee employee);
	String newEmployee(Employee employee);

}
