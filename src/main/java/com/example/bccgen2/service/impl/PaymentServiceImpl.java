package com.example.bccgen2.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.bccgen2.model.Payment;
import com.example.bccgen2.repository.PaymentRepository;
import com.example.bccgen2.service.PaymentService;

@Service
public class PaymentServiceImpl implements PaymentService  {
	
	
	@Autowired
	PaymentRepository paymentRepository;

	@Override
	public List<Payment> findAll() {
		// TODO Auto-generated method stub
		return paymentRepository.findAll();
	}

	@Override
	public String regPayment(Payment reg) {
		// TODO Auto-generated method stub
		String result = "failed";
		if(reg != null) {
			paymentRepository.save(reg);
			result = "sucses";
		}
		return result;
	}

	@Override
	public String updPayment(Payment reg) {
		// TODO Auto-generated method stub
		String result = "failed to update";
		Optional<Payment>optPayment=
				paymentRepository.findById(reg.getIdPayment());
		if(optPayment.isPresent()) {
			paymentRepository.save(reg);
			result = "sukses to update";
		}
		return result;
	}

	@Override
	public String delPayment(String id) {
		// TODO Auto-generated method stub
		String result = "failed to delete";
		Optional<Payment> optPayment=
				paymentRepository.findById(id);
		result = "sukses to delete";
		if(optPayment.isPresent()) {
			paymentRepository.deleteById(id);
			result = "sukses to delete by id";
			
		}
		return result;
	}
	
	
}
