package com.edu.ue;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages = {"com.edu.ue.model"})
@EnableJpaRepositories(basePackages = {"com.edu.co.bill.dao"})
@ComponentScan(basePackages = {
		"com.edu.co.bill.controller",
		"com.edu.co.bill.service",
		"com.edu.co.bill.dao"
})
public class ProyectoFinalAppEscritorioIiiApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProyectoFinalAppEscritorioIiiApplication.class, args);
	}

}
