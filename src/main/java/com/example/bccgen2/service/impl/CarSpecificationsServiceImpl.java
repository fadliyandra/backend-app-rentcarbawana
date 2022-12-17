package com.example.bccgen2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bccgen2.model.CarSpecification;
import com.example.bccgen2.repository.CarSpecificationRepository;
import com.example.bccgen2.service.CarSpecificationService;

@Service
public class CarSpecificationsServiceImpl implements CarSpecificationService{
	
	@Autowired
	CarSpecificationRepository carSpecificationRepository;

	@Override
	public List<CarSpecification> findAll() {
		// TODO Auto-generated method stub
		return carSpecificationRepository.findAll();
	}

	@Override
	public String regCarSpecification(CarSpecification reg) {
		String result = "failed";
		if(reg != null) {
			carSpecificationRepository.save(reg);
			result = "sucses";
		}
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public String updCarSpecification(CarSpecification reg) {
		
		// TODO Auto-generated method stub
		String result = "failed to update";
		Optional<CarSpecification>optCarSpecifications=
				carSpecificationRepository.findById(reg.getIdCar());
		if(optCarSpecifications.isPresent()) {
			carSpecificationRepository.save(reg);
			result = "sucses to update";
		}
		return result;
	}

	@Override
	public String delCarSpecification(String id) {
		// TODO Auto-generated method stub
		String result = "failed to delete";
		Optional<CarSpecification>optCarSpecifications=
				carSpecificationRepository.findById(id);
				result = "sucses to delete";
		if(optCarSpecifications.isPresent()) {
			carSpecificationRepository.deleteById(id);
			result = "sucses to delete";
		}
		return result;
	}
	
	

}
