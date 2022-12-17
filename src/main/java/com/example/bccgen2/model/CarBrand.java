package com.example.bccgen2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CAR_BRAND", schema = "PROJECTAPP")
@Entity
public class CarBrand {
	
	@Id
	@Column(name = "ID_BRAND")
	private String idBrand;
	
	@Column(name = "BRAND_NAME")
	private String brandName;

	public String getIdBrand() {
		return idBrand;
	}

	public void setIdBrand(String idBrand) {
		this.idBrand = idBrand;
	}

	public String getBrandName() {
		return brandName;
	}

	public void setBrandName(String brandName) {
		this.brandName = brandName;
	}

	

	
	
	

}
