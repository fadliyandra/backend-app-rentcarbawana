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

import com.example.bccgen2.model.Car_Type;
import com.example.bccgen2.service.CarTypeService;

@RestController
@RequestMapping("api/bccgen2/cartype")
public class CarTypeController {
	
	@Autowired
	CarTypeService carTypeService;
	
	@GetMapping
	public List<Car_Type>findAll(){
		return carTypeService.findAll();
	}
	
	@PostMapping
	public String regCarType(@RequestBody Car_Type reg) {
		return carTypeService.regCarType(reg);
		
	}
	
	@PutMapping
	public String updCarType(@RequestBody Car_Type reg) {
		return carTypeService.updCarType(reg);
	}
	
	@DeleteMapping("{idCarType}")
	public String delCarType(@PathVariable String idCarType ) {
		return carTypeService.delCarType(idCarType);
	}
		
	
	
	

}
