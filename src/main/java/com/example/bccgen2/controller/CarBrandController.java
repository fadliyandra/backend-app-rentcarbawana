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

import com.example.bccgen2.model.CarBrand;

import com.example.bccgen2.service.CarBrandService;


@RestController
@RequestMapping("api/bccgen2/carbrand")
public class CarBrandController {
	
	@Autowired
	CarBrandService carBrandService;
	
	@GetMapping
	public List<CarBrand>findAll(){
		return carBrandService.findAll();
	}
	
	@PostMapping
	public String regCarBrand(@RequestBody CarBrand reg) {
		return carBrandService.regCarBrand(reg);
		
	}
	
	@PutMapping
	public String updCarBrand(@RequestBody CarBrand reg) {
		return carBrandService.updCarBrand(reg);
	}
	
	@DeleteMapping("{idBrand}")
	public String delCarBrand(@PathVariable String idBrand ) {
		return carBrandService.delCarBrand(idBrand);
	}
		
	
	
	

}
