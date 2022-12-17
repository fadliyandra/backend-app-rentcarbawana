package com.example.bccgen2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bccgen2.model.Customer;
import com.example.bccgen2.repository.CustomerRepository;

import com.example.bccgen2.service.CustomerService;

@Service
public class CustomerServiceImpl implements CustomerService{
	
	@Autowired
	CustomerRepository customerRepository;

	@Override
	public List<Customer> findAll() {
		// TODO Auto-generated method stub
		return customerRepository.findAll();
	}

	@Override
	public String regCustomer(Customer reg) {
		String result = "failed";
		if(reg != null) {
			customerRepository.save(reg);
			result = "sukses";
		}
		// TODO Auto-generated method stub
		return result;
	}

	@Override
	public String updCustomer(Customer reg) {
		// TODO Auto-generated method stub
		String result = "failed to update";
		Optional<Customer> optCustomer=
				customerRepository.findById(reg.getIdCustomer());
		if(optCustomer.isPresent()) {
			customerRepository.save(reg);
			result = "sukses to update";
		}
		return result;
	}

	@Override
	public String delCustomer(String id) {
		// TODO Auto-generated method stub
		String result = "failed to delete";
		Optional<Customer>optCustomer=
				customerRepository.findById(id);
		result = "sucses to delete";
		
		if(optCustomer.isPresent()) {
			customerRepository.deleteById(id);
			result = "sucses to delete";
		}
			
		return result;
	}

	


}
