package com.example.bccgen2.service;

import java.util.List;

import com.example.bccgen2.model.Admin;

public interface AdminService {
	
	public List<Admin>findAll();
	
	
	public String regAdmin(Admin reg);
	
	public String updAdmin(Admin reg);
	
	public String delAdmin(String id);
	
}
