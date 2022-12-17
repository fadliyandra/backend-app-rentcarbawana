package com.example.bccgen2.service;

import java.util.List;

import com.example.bccgen2.model.Rental;

public interface RentalService {
	
	
	public List<Rental>findAll();
	
	public String regRental(Rental reg);
	
	public String updRental(Rental reg);
	
	public String delRental(String id);

}
