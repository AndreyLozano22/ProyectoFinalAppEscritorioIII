package com.edu.co.empleado.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.edu.ue.model.Employee;


@Repository
public class EmpleadoDao implements EmpleadoDaoI {
	
	@Autowired
	EmpleadoJpal myEmpleado;

	@Override
	public java.util.List<Employee> getEmpleados() {
		return myEmpleado.findAll();
	}

	@Override
	public void deleteEmpleados(int employeeId) {
		myEmpleado.deleteById(employeeId);
	}


	@Override
	public Employee updateEmpleados(Employee employeeId) {
		return myEmpleado.save(employeeId);
	}
}
