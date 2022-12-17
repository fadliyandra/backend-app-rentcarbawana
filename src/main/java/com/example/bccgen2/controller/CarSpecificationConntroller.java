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

import com.example.bccgen2.model.CarSpecification;
import com.example.bccgen2.service.CarSpecificationService;

@RestController
@RequestMapping("api/bccgen2/carspecification")
public class CarSpecificationConntroller {
	
	@Autowired
	CarSpecificationService carSpecificationService;
	
	@GetMapping
	public List<CarSpecification>findAll(){
		return carSpecificationService.findAll();
	}
	
	@PostMapping
	public String regCarSpecification(@RequestBody CarSpecification reg) {
		return carSpecificationService.regCarSpecification(reg);
	}
	
	@PutMapping
	public String updCarSpecification(@RequestBody CarSpecification reg) {
		return carSpecificationService.updCarSpecification(reg);
	}
	
	@DeleteMapping("{idCar}")
	public String delCarSpecification(@PathVariable String idCar) {
		return carSpecificationService.delCarSpecification(idCar);
	}
	
	
	
	
	

}
