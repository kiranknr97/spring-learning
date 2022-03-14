package com.project.beer.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.project.beer.model.BeerDao;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDao getBeerById(UUID id) {
		return BeerDao.builder().id(id)
				.beerName("Galaxy Beer")
				.beerStyle("Pale")
				.build();
	}

	@Override
	public BeerDao createBeerObject(BeerDao beer) {
		// TODO Auto-generated method stub
		return BeerDao.builder().id(UUID.randomUUID())
				.beerName(beer.getBeerName())
				.beerStyle(beer.getBeerStyle())
				.upc(beer.getUpc())
				.build();
	}

	@Override
	public void updateBeerObject(BeerDao beer) {
		// TODO Auto-generated method stub
		
	}

}
