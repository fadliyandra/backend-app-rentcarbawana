package com.example.bccgen2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.example.bccgen2.model.Rental;
import com.example.bccgen2.repository.RentalRepository;

import com.example.bccgen2.service.RentalService;

@Service
public class RentalServiceImpl implements RentalService{
	
	@Autowired
	RentalRepository rentalRepository;

	@Override
	public List<Rental> findAll() {
		
		// TODO Auto-generated method stub
		return rentalRepository.findAll();
	}

	@Override
	public String regRental(Rental reg) {
		// TODO Auto-generated method stub
		String result = "failed";
		if(reg != null) {
			rentalRepository.save(reg);
			result = "sukses";
		}
		return result;
	}

	@Override
	public String updRental(Rental reg) {
		String result = "failed to update";
		Optional<Rental>optRental=
				rentalRepository.findById(reg.getIdRental());
		
		if(optRental.isPresent()) {
			rentalRepository.save(reg);
			result = "sukses to update";
		}
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public String delRental(String id) {
		String result = "failed to delete";
		Optional<Rental>optRental=
				rentalRepository.findById(id);
		result = "sucses to delete";
		
		if(optRental.isPresent()) {
			rentalRepository.deleteById(id);
			result = "sucses to delete";
		}
		// TODO Auto-generated method stub
		return result;
	}


}
