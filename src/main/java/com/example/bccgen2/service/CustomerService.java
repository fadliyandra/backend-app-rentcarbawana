package com.example.bccgen2.service;

import java.util.List;

import com.example.bccgen2.model.Customer;

public interface CustomerService {
	
	
	public List<Customer>findAll();
	
	public String regCustomer(Customer reg);
	
	public String updCustomer(Customer reg);
	
	public String delCustomer(String id);

}
