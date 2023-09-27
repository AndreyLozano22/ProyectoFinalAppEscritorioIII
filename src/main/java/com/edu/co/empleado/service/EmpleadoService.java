package com.edu.co.empleado.service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.edu.co.empleado.dao.EmpleadoDaoI;
import com.edu.ue.model.Employee;

@Service
public class EmpleadoService implements EmpleadoServiceI{

	
	@Autowired
	EmpleadoDaoI daoEmpleado;

	
	@Override
	public List<Employee> getAllEmpleado() {
		return daoEmpleado.getEmpleados();
	}

	@Override
	public Employee newEmpleados(Employee employee) {
		return daoEmpleado.createEmpleados(employee);
	}

	@Override
	public void deleteAllEmpleados(int employeeId) {
		daoEmpleado.deleteEmpleados(employeeId);
	}

	@Override
	public Employee updateAllEmpleados(Employee employee) {
		return daoEmpleado.updateEmpleados(employee);
	}

}
