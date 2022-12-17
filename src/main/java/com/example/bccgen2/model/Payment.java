package com.example.bccgen2.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "PAYMENT", schema = "PROJECTAPP")
@Entity
public class Payment {
	
	
	@Id
	@Column(name = "ID_PAYMENT")
	private String idPayment;
	
	@Column(name = "TYPE_OF_PAYMENT")
	private String typeOfPayment;
	
	
	@Column(name = "RENTAL_PAYMENT_DATE")
	private Date rentalPayment_Date;
	
	@Column(name = "CUSTOMER_NAME")
	private String customerName;
	
	@Column(name = "DESTINATION_BANK")
	private String destinationBank;
	
	@Column(name = "DESTINATION_ACCOUNT_NUMBER")
	private String destinationAccountNumber;
	
	@Column(name = "TOTAL_PAYMENT")
	private Integer totalPayment ;

	public String getIdPayment() {
		return idPayment;
	}

	public void setIdPayment(String idPayment) {
		this.idPayment = idPayment;
	}

	public String getTypeOfPayment() {
		return typeOfPayment;
	}

	public void setTypeOfPayment(String typeOfPayment) {
		this.typeOfPayment = typeOfPayment;
	}

	public Date getRentalPayment_Date() {
		return rentalPayment_Date;
	}

	public void setRentalPayment_Date(Date rentalPayment_Date) {
		this.rentalPayment_Date = rentalPayment_Date;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getDestinationBank() {
		return destinationBank;
	}

	public void setDestinationBank(String destinationBank) {
		this.destinationBank = destinationBank;
	}

	public String getDestinationAccountNumber() {
		return destinationAccountNumber;
	}

	public void setDestinationAccountNumber(String destinationAccountNumber) {
		this.destinationAccountNumber = destinationAccountNumber;
	}

	public Integer getTotalPayment() {
		return totalPayment;
	}

	public void setTotalPayment(Integer totalPayment) {
		this.totalPayment = totalPayment;
	}

	

}
