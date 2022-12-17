package com.example.bccgen2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "DRIVER", schema = "PROJECTAPP")
@Entity
public class Driver {
	
	@Id
	@Column(name = "ID_DRIVER")
	private String idDriver;
	
	@Column(name = "DRIVER_NAME")
	private String driverName;
	
	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;

	public String getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(String idDriver) {
		this.idDriver = idDriver;
	}

	public String getDriverName() {
		return driverName;
	}

	public void setDriverName(String driverName) {
		this.driverName = driverName;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	

}
