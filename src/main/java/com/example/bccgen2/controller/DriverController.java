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

import com.example.bccgen2.model.Driver;
import com.example.bccgen2.service.DriverService;

@RestController
@RequestMapping("api/bccgen2/driver")
public class DriverController {
	
	@Autowired
	DriverService driverService;
	
	@GetMapping
	public List<Driver>findAll(){
		return driverService.findAll();
	}
	
	@PostMapping
	public String regDriver(@RequestBody Driver reg) {
		return driverService.regDriver(reg);
		
	}
	
	@PutMapping
	public String updDriver(@RequestBody Driver reg) {
		return driverService.updDriver(reg);
	}
	
	@DeleteMapping("{idDriver}")
	public String delDriver(@PathVariable String idDriver ) {
		return driverService.delDriver(idDriver);
	}
		
	
	
	

}
