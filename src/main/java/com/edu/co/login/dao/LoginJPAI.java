package com.edu.co.login.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ue.model.Employee;

public interface LoginJPAI extends JpaRepository<Employee, Integer> {
	
	Employee findByUsername(String username);

}
