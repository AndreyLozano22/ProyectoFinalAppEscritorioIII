package com.edu.co.login.controller;


import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.validation.Errors;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.co.login.service.LoginServiceI;
import com.edu.ue.model.Employee;

@CrossOrigin(origins = "*")
@RestController
public class LoginController {
	
	@Autowired
	LoginServiceI service;
	
	@PostMapping(value="createEmployee", consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String addEmployee(@Valid @RequestBody Employee employee, Errors errors) {
		if(errors.hasErrors()) {
			return errors.getAllErrors().toString();
		}
		return service.newEmployee(employee);		
		
	}
	
	@PostMapping(value="login", consumes=MediaType.APPLICATION_JSON_VALUE, produces=MediaType.APPLICATION_JSON_VALUE)
	public String newLogin(@RequestBody Employee employee) {
		return service.login(employee);		
		
	}

}
