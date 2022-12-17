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

import com.example.bccgen2.model.Admin;
import com.example.bccgen2.service.AdminService;

@RestController
@RequestMapping("api/bccgen2/admin")
public class AdminController {
	
	@Autowired
	AdminService adminService;
	
	@GetMapping
	public List<Admin> findAll(){
		return adminService.findAll();
	}
	
	@PostMapping
	public String regAdmin(@RequestBody Admin reg) {
		return adminService.regAdmin(reg);
		
	}
	
	@PutMapping
	public String updAdmin(@RequestBody Admin reg) {
		return adminService.updAdmin(reg);
		
	}
	
	@DeleteMapping("{idAdmin}")
	public String delAdmin(@PathVariable String idAdmin) {
		return adminService.delAdmin(idAdmin);
	}
	
	
	
	

}
