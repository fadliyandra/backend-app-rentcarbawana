package com.example.bccgen2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bccgen2.model.Driver;
import com.example.bccgen2.repository.DriverRepository;

import com.example.bccgen2.service.DriverService;

@Service
public class DriverServiceImpl implements DriverService{
	
	@Autowired
	DriverRepository driverRepository;

	@Override
	public List<Driver> findAll() {
		// TODO Auto-generated method stub
		return driverRepository.findAll();
	}

	@Override
	public String regDriver(Driver reg) {
		// TODO Auto-generated method stub
		String result = "failed";
		if(reg != null) {
			driverRepository.save(reg);
			result = "sukses";
		}
		return result;
	}

	@Override
	public String updDriver(Driver reg) {
		String result = "failed to update";
		Optional<Driver>optDriver=
				driverRepository.findById(reg.getIdDriver());
				
		
		if(optDriver.isPresent()) {
			driverRepository.save(reg);
			result = "sukses to update";
		}
		// TODO Auto-generated method stub
		return result;
	}
	@Override
	public String delDriver(String id) {
		String result = "failed to delete";
		Optional<Driver>optDriver=
				driverRepository.findById(id);
		result = "sucses to delete";
		
		if(optDriver.isPresent()) {
			driverRepository.deleteById(id);
			result = "sucses to delete";
		}
		// TODO Auto-generated method stub
		return result;
	}
	
	


}
