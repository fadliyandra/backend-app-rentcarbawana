package com.example.bccgen2.repository;

import org.springframework.data.jpa.repository.JpaRepository;


import com.example.bccgen2.model.Rental;

public interface RentalRepository extends JpaRepository<Rental, String>{

}
