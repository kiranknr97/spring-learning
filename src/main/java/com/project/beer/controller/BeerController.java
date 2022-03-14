package com.project.beer.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.beer.model.BeerDao;
import com.project.beer.service.BeerService;


@RestController
@RequestMapping("/api/v1/beer")
public class BeerController {
	
	@Autowired
	private BeerService beerService;
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDao> getBeer(@PathVariable UUID beerId){
		
		return new ResponseEntity<>(beerService.getBeerById(beerId),HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity createBeer(@RequestBody BeerDao beer){
		BeerDao newBeer = beerService.createBeerObject(beer);
		
		HttpHeaders header = new HttpHeaders();
		header.add("Location", "/api/v1/beer"+newBeer.getId().toString());
		return new ResponseEntity(header , HttpStatus.CREATED);
	}
	
	@PutMapping
	public ResponseEntity updateBeer(BeerDao beer) {
		beerService.updateBeerObject(beer);
		
		return new ResponseEntity(HttpStatus.NO_CONTENT);
	}
	
}
