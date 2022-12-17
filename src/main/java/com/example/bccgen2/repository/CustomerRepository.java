package com.example.bccgen2.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.bccgen2.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, String>{

}
