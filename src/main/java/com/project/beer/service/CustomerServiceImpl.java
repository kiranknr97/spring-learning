package com.project.beer.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.project.beer.model.CustomerDAO;

@Service
public class CustomerServiceImpl implements CustomerService {

	@Override
	public CustomerDAO getCustomerById(UUID id) {
		// TODO Auto-generated method stub
		return CustomerDAO.builder().id(id)
				.firstName("Kiran")
				.lastname("Nair")
				.email("krian.anir@mail.com")
				.build();
	}

}
