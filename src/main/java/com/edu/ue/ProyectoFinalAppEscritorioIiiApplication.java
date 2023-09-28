package com.edu.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.edu.ue.model"})
@EnableJpaRepositories(basePackages = {"com.edu.co.bill.dao", "com.edu.co.empleado.dao","com.edu.co.product.dao"})
@ComponentScan(basePackages = {
		"com.edu.co.bill.controller",
		"com.edu.co.bill.service",
		"com.edu.co.bill.dao",
		"com.edu.co.login.controller",
		"com.edu.co.login.service",
		"com.edu.co.login.dao",
		"com.edu.co.product.controller",
		"com.edu.co.product.service",
		"com.edu.co.product.dao",
		"com.edu.co.empleado.controller",
		"com.edu.co.empleado.service",
		"com.edu.co.empleado.dao"
})
public class ProyectoFinalAppEscritorioIiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalAppEscritorioIiiApplication.class, args);
	}

}
