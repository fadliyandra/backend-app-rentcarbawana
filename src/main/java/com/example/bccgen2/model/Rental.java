package com.example.bccgen2.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "RENTAL", schema = "PROJECTAPP")
@Entity
public class Rental {
	
	@Id
	@Column(name = "ID_RENTAL")
	private String idRental;
	
	@Column(name = "ID_CUSTOMER")
	private String idCustomer;
	
	@Column(name = "ID_CAR")
	private String idMobil;
	
	@Column(name = "ID_DRIVER")
	private String idDriver;
	
	@Column(name = "ID_PAYMENT")
	private String idPayment;
	
	@Column(name = "LEASE_INITIAL_DATE")
	private Date leaseInitialDate;
	
	@Column(name = "LEASE_END_DATE")
	private Date leaseEndDate;
	
	
	@Column(name = "RENT_GUARANTEE")
	private String rentGuarantee;
	
	@Column(name = "RENTAL_COST")
	private Integer rentalCost;

	public String getIdRental() {
		return idRental;
	}

	public void setIdRental(String idRental) {
		this.idRental = idRental;
	}

	public String getIdCustomer() {
		return idCustomer;
	}

	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}

	public String getIdMobil() {
		return idMobil;
	}

	public void setIdMobil(String idMobil) {
		this.idMobil = idMobil;
	}

	public String getIdDriver() {
		return idDriver;
	}

	public void setIdDriver(String idDriver) {
		this.idDriver = idDriver;
	}

	public String getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(String idPayment) {
		this.idPayment = idPayment;
	}

	public Date getLeaseInitialDate() {
		return leaseInitialDate;
	}

	public void setLeaseInitialDate(Date leaseInitialDate) {
		this.leaseInitialDate = leaseInitialDate;
	}

	public Date getLeaseEndDate() {
		return leaseEndDate;
	}

	public void setLeaseEndDate(Date leaseEndDate) {
		this.leaseEndDate = leaseEndDate;
	}

	public String getRentGuarantee() {
		return rentGuarantee;
	}

	public void setRentGuarantee(String rentGuarantee) {
		this.rentGuarantee = rentGuarantee;
	}

	public Integer getRentalCost() {
		return rentalCost;
	}

	public void setRentalCost(Integer rentalCost) {
		this.rentalCost = rentalCost;
	}


	
	

}
