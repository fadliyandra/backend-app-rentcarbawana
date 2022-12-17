package com.example.bccgen2.service;

import java.util.List;

import com.example.bccgen2.model.Driver;


public interface DriverService {
	
	
	public List<Driver>findAll();
	
	public String regDriver(Driver reg);
	
	public String updDriver(Driver reg);
	
	public String delDriver(String id);

}
