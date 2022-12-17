package com.example.bccgen2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CUSTOMER", schema = "PROJECTAPP")
@Entity
public class Customer {
	
	@Id
	@Column(name = "ID_CUSTOMER")
	private String idCustomer;
	
	@Column(name = "IDENTITY_NUMBER")
	private String identityNumber;
	
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	
	@Column(name = "ADDRESS")
	private String address;
	

	@Column(name = "EMAIL")
	private String email;
	

	@Column(name = "PHONE_NUMBER")
	private String phoneNumber;
	

	@Column(name = "USER_NAME")
	private String userName;


	@Column(name = "PASSWORD")
	private String password;


	public String getIdCustomer() {
		return idCustomer;
	}


	public void setIdCustomer(String idCustomer) {
		this.idCustomer = idCustomer;
	}


	public String getIdentityNumber() {
		return identityNumber;
	}


	public void setIdentityNumber(String identityNumber) {
		this.identityNumber = identityNumber;
	}


	public String getCustomerName() {
		return customerName;
	}


	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}


	public String getAddress() {
		return address;
	}


	public void setAddress(String address) {
		this.address = address;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getPhoneNumber() {
		return phoneNumber;
	}


	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getPassword() {
		return password;
	}


	public void setPassword(String password) {
		this.password = password;
	}


	
	

}
