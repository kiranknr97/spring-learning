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
public class CustomerDAO {
	
	private UUID id;
	private String firstName;
	private String lastname;
	private String email;
}
