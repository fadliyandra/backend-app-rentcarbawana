package com.example.bccgen2.service;

import java.util.List;

import com.example.bccgen2.model.CarBrand;

public interface CarBrandService {
	
	
	public List<CarBrand>findAll();
	
	public String regCarBrand(CarBrand reg);
	
	public String updCarBrand(CarBrand reg);
	
	public String delCarBrand(String id);

}
