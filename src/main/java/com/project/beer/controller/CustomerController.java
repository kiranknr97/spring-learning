package com.project.beer.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.beer.model.CustomerDAO;
import com.project.beer.service.CustomerService;

@RestController
@RequestMapping("/api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService service;
	
	@GetMapping("/{customerId}")
	public ResponseEntity<CustomerDAO> getCustomer(@PathVariable UUID customerId){
		return new ResponseEntity<CustomerDAO>(service.getCustomerById(customerId), HttpStatus.OK);
	}
}
