package com.example.bccgen2.service;

import java.util.List;

import com.example.bccgen2.model.CarSpecification;

public interface CarSpecificationService {

	
	public List<CarSpecification>findAll();
	
	public String regCarSpecification(CarSpecification reg);
	
	public String updCarSpecification(CarSpecification reg);
	
	public String delCarSpecification(String id);
	
}
