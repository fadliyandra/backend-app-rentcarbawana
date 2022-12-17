package com.example.bccgen2.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.example.bccgen2.model.Customer;
import com.example.bccgen2.service.CustomerService;

@RestController
@RequestMapping("api/bccgen2/customer")
public class CustomerController {
	
	@Autowired
	CustomerService customerService;
	
	
	@GetMapping
	public List<Customer>findAll(){
		return customerService.findAll();
	}
	
	@PostMapping
	public String regCustomer(@RequestBody Customer reg) {
		return customerService.regCustomer(reg);
		
	}
	
	@PutMapping
	public String updCustomer(@RequestBody Customer reg) {
		return customerService.updCustomer(reg);
	}
	
	@DeleteMapping("{idCustomer}")
	public String delCustomer(@PathVariable String idCustomer ) {
		return customerService.delCustomer(idCustomer);
	}
	

}
