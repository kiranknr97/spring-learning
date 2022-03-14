package com.project.beer.service;

import java.util.UUID;

import com.project.beer.model.CustomerDAO;

public interface CustomerService {
	
	public CustomerDAO getCustomerById(UUID id);
}
