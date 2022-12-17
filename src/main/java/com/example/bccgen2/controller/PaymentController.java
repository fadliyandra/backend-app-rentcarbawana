package com.example.bccgen2.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.bccgen2.model.Payment;
import com.example.bccgen2.service.PaymentService;

@RestController
@RequestMapping("api/bccgen2/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@GetMapping
	public List<Payment> findAll(){
		return paymentService.findAll();
	}
	
	@PostMapping
	public String regPayment(@RequestBody Payment reg) {
		return paymentService.regPayment(reg);
		
	}
	
	@PutMapping
	public String updPayment(@RequestBody Payment reg) {
		return paymentService.updPayment(reg);
		
	}
	
	@DeleteMapping("{idPayment}")
	public String delPayement(@PathVariable String idPayment) {
		return paymentService.delPayment(idPayment);
		
	}
	


}
