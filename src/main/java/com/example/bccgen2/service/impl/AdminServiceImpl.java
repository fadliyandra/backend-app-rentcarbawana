package com.example.bccgen2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bccgen2.model.Admin;

import com.example.bccgen2.repository.AdminRepository;

import com.example.bccgen2.service.AdminService;


@Service
public class AdminServiceImpl implements AdminService  {
	
	@Autowired
	AdminRepository adminRepository;

	@Override
	public List<Admin> findAll() {
		// TODO Auto-generated method stub
		return adminRepository.findAll();
	}

	@Override
	public String regAdmin(Admin reg) {
		// TODO Auto-generated method stub
		String result = "failed";
		if(reg != null) {
			adminRepository.save(reg);
			result = "sucses to save";
		}
		return result;
	}

	@Override
	public String updAdmin(Admin reg) {
		// TODO Auto-generated method stub
		String result = "failed to update";
		Optional<Admin>optAdmin=
				adminRepository.findById(reg.getIdAdmin());
		if(optAdmin.isPresent()) {
			adminRepository.save(reg);
			result = "sucses to update";
		}
		return result;
	}

	@Override
	public String delAdmin(String id) {
		// TODO Auto-generated method stub
		
		String result = "failed to delete";
		Optional<Admin>optAdmin=
				adminRepository.findById(id);
		result = "sucses to delete";
		if(optAdmin.isPresent()) {
			adminRepository.deleteById(id);
			result = "sucses to delete by id";
		}
		return result;
	}
	

}
