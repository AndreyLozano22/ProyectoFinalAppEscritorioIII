package com.edu.co.bill.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.Errors;
import org.springframework.http.MediaType;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.edu.co.bill.service.BillServiceI;
import com.edu.ue.model.Bill;

@CrossOrigin(origins = "*")
@RestController
public class BillController {
	@Autowired
	BillServiceI service;
	
	@GetMapping(value="bills",produces=MediaType.APPLICATION_JSON_VALUE)
	public List<Bill> getAllBill(){
		return service.getAllBill();
	}
	
	@PostMapping(value="newBill",consumes=MediaType.APPLICATION_JSON_VALUE,produces=MediaType.APPLICATION_JSON_VALUE)
	public String newBill(@Valid @RequestBody Bill bill, Errors errors, Model model) {
		if(errors.hasErrors()) {
			return errors.getAllErrors().toString();
			
		}
		service.newBill(bill);
		return "Se ha creado una factura";
	}
	
	@DeleteMapping(value="deleteBill/{bullId}")
	public void dropBill(@PathVariable  int bullId) {
		service.dropBill(bullId);
	}
}
