package com.example.bccgen2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "ADMIN", schema = "PROJECTAPP" )
@Entity
public class Admin {
	
	@Id
	@Column(name = "ID_ADMIN")
	private String idAdmin;
	
	@Column(name = "ADMIN_NAME")
	private String adminName;
	
	
	@Column(name = "PASSWORD")
	private String password;


	public String getIdAdmin() {
		return idAdmin;
	}


	public void setIdAdmin(String idAdmin) {
		this.idAdmin = idAdmin;
	}


	public String getAdminName() {
		return adminName;
	}


	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	

}
