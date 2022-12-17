package com.example.bccgen2.service;

import java.util.List;

import com.example.bccgen2.model.Car_Type;

public interface CarTypeService {
	
	
	public List<Car_Type>findAll();
	
	public String regCarType(Car_Type reg);
	
	public String updCarType(Car_Type reg);
	
	public String delCarType(String id);

}
