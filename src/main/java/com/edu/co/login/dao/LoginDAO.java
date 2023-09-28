package com.edu.co.login.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.ue.model.Employee;

@Repository
public class LoginDAO implements LoginDAOI {
	
	@Autowired
	LoginJPAI myEmployee;

	@Override
	public Employee createEmployee(Employee employee) {
		return myEmployee.save(employee);
	}

	@Override
	public Employee getEmployee(String username) {
		return myEmployee.findByUsername(username);
	}

}
