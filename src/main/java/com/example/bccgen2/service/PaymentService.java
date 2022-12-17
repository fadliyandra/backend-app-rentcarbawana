package com.example.bccgen2.service;

import java.util.List;

import com.example.bccgen2.model.Payment;

public interface PaymentService {
	
	public List<Payment>findAll();
	
	public String regPayment(Payment reg);
	
	public String updPayment(Payment reg);
	
	public String delPayment(String id);
	
}
