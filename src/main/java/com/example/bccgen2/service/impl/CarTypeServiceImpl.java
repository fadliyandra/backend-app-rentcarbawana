package com.example.bccgen2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bccgen2.model.Car_Type;

import com.example.bccgen2.repository.CarTypeRepository;
import com.example.bccgen2.service.CarTypeService;

@Service
public class CarTypeServiceImpl implements CarTypeService{
	
	@Autowired
	CarTypeRepository carTypeRepository;

	@Override
	public List<Car_Type> findAll() {
		// TODO Auto-generated method stub
		return carTypeRepository.findAll();
	}

	@Override
	public String regCarType(Car_Type reg) {
		// TODO Auto-generated method stub
		
		String result = "failed";
		if(reg != null) {
			carTypeRepository.save(reg);
			result = "sucses";
		}
		return result;
	}

	@Override
	public String updCarType(Car_Type reg) {
		// TODO Auto-generated method stub
		String result = "failed to update";
		Optional<Car_Type>optCarType=
				carTypeRepository.findById(reg.getIdCarType());
		if(optCarType.isPresent()) {
			carTypeRepository.save(reg);
			result = "sucses to update";
		}
		return result;
	}

	@Override
	public String delCarType(String id) {
		String result = "failed to delete";
		Optional<Car_Type>optCarType=
				carTypeRepository.findById(id);
		result = "sucses to delete";
		
		if(optCarType.isPresent()) {
			carTypeRepository.deleteById(id);
			result = "sucses to delete";
		}
		// TODO Auto-generated method stub
		return result;
	}
	
	


}
