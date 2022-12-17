package com.example.bccgen2.model;

import java.sql.Blob;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CAR_SPECIFICATION", schema= "PROJECTAPP")
@Entity
public class CarSpecification {
	
	@Id
	@Column(name = "ID_CAR")
	private String idCar;
	
	@Column(name = "ID_CAR_TYPE")
	private String idCarType;
	
	@Column(name = "ID_BRAND")
	private String idBrand;
	
	@Column(name = "CAR_COLOR")
	private String carColor;
	
	@Column(name = "CAR_IMAGES")
	private Blob carImages;
	
	@Column(name = "CAR_CONDITION")
	private String carCondition;
	
	@Column(name = "RENTAL_PRICE")
	private Integer rentalPrice;

	public String getIdCar() {
		return idCar;
	}

	public void setIdCar(String idCar) {
		this.idCar = idCar;
	}

	public String getIdCarType() {
		return idCarType;
	}

	public void setIdCarType(String idCarType) {
		this.idCarType = idCarType;
	}

	public String getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(String idBrand) {
		this.idBrand = idBrand;
	}

	public String getCarColor() {
		return carColor;
	}

	public void setCarColor(String carColor) {
		this.carColor = carColor;
	}

	public Blob getCarImages() {
		return carImages;
	}

	public void setCarImages(Blob carImages) {
		this.carImages = carImages;
	}

	public String getCarCondition() {
		return carCondition;
	}

	public void setCarCondition(String carCondition) {
		this.carCondition = carCondition;
	}

	public Integer getRentalPrice() {
		return rentalPrice;
	}

	public void setRentalPrice(Integer rentalPrice) {
		this.rentalPrice = rentalPrice;
	}

	

}
