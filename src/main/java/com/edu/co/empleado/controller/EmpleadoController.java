package com.edu.co.empleado.controller;

import java.util.List;

import org.springframework.http.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.co.empleado.service.EmpleadoServiceI;
import com.edu.ue.model.Employee;

@CrossOrigin(origins = "*")
@RestController
public class EmpleadoController {
	
	@Autowired
	EmpleadoServiceI service;
	
	
	@GetMapping(value="empleados",produces = MediaType.APPLICATION_JSON_VALUE)
	public List<Employee> getEmployees (){
		return service.getAllEmpleado();
	}
	
	@PostMapping(value="newempleados",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee newEmpleados(@RequestBody  Employee employee) {
		return service.newEmpleados(employee);
	}
	
	@DeleteMapping(value = "deleteempleados/{employeeId}")
	public void dropEmpleados (@PathVariable int employeeId) {
		service.deleteAllEmpleados(employeeId);
	}
	
	@PostMapping(value="Updateempleados",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public Employee updateEmpleados (@RequestBody Employee employee) {
		return service.updateAllEmpleados(employee);
	}

}
