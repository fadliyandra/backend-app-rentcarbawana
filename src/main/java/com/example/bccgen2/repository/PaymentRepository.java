package com.example.bccgen2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bccgen2.model.Payment;

public interface PaymentRepository extends JpaRepository<Payment, String>{
	

}
