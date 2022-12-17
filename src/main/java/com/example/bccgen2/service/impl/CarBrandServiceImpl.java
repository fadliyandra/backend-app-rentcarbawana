package com.example.bccgen2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bccgen2.model.CarBrand;
import com.example.bccgen2.repository.CarBrandRepository;
import com.example.bccgen2.service.CarBrandService;

@Service
public class CarBrandServiceImpl implements CarBrandService{
	
	@Autowired
	CarBrandRepository carBrandRepository;

	@Override
	public List<CarBrand> findAll() {
		// TODO Auto-generated method stub
		return carBrandRepository.findAll();
	}

	@Override
	public String regCarBrand(CarBrand reg) {
		// TODO Auto-generated method stub
		String result = "failed";
		if (reg !=null) {
			carBrandRepository.save(reg);
			result = "sucses";
		}
		
		return result;
	}

	@Override
	public String updCarBrand(CarBrand reg) {
		// TODO Auto-generated method stub
		String result = "failed to update";
		Optional<CarBrand>optCarBrand=
				carBrandRepository.findById(reg.getIdBrand());
		if(optCarBrand.isPresent()) {
			carBrandRepository.save(reg);
			result= "sucses to update";
		}
		return result;
	}

	@Override
	public String delCarBrand(String id) {
		// TODO Auto-generated method stub
		String result = "failed to delete";
		Optional<CarBrand>optCarBrand=
				carBrandRepository.findById(id);
		result = "sucses to delete";
		if(optCarBrand.isPresent()) {
			carBrandRepository.deleteById(id);
			result ="sucses to delete";
		}
			
		return result;
	}



}
