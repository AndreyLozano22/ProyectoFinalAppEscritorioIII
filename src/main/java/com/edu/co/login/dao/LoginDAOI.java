package com.edu.co.login.dao;

import com.edu.ue.model.Employee;

public interface LoginDAOI {
	
	Employee getEmployee(String username);
	Employee createEmployee(Employee employee);
	
}
