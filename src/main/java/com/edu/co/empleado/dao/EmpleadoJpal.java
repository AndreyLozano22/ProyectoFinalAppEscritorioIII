package com.edu.co.empleado.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.ue.model.Employee;

public interface EmpleadoJpal  extends JpaRepository< Employee, Integer>{

}
