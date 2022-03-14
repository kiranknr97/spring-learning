package com.project.beer.model;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BeerDao {
	
	private UUID id;
	private String beerName;
	private String beerStyle;
	private Long upc;
}
