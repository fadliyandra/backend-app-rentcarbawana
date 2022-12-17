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


import com.example.bccgen2.model.Rental;

import com.example.bccgen2.service.RentalService;

@RestController
@RequestMapping("api/bccgen2/rental")
public class RentalController {
	
	@Autowired
	RentalService rentalService;
	
	@GetMapping
	public List<Rental>findAll(){
		return rentalService.findAll();
	}
	
	@PostMapping
	public String regRental(@RequestBody Rental reg) {
		return rentalService.regRental(reg);
		
	}
	
	@PutMapping
	public String updRental(@RequestBody Rental reg) {
		return rentalService.updRental(reg);
	}
	
	@DeleteMapping("{idRental}")
	public String delRental(@PathVariable String idRental ) {
		return rentalService.delRental(idRental);
	}
		
	
	
	

}
