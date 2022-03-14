package com.project.beer.service;

import java.util.UUID;

import com.project.beer.model.BeerDao;

public interface BeerService {
	
	BeerDao getBeerById(UUID id);

	BeerDao createBeerObject(BeerDao beer);

	void updateBeerObject(BeerDao beer);

}
