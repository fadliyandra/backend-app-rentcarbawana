package com.example.bccgen2.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "CAR_TYPE", schema = "PROJECTAPP")
@Entity
public class Car_Type {
	
	@Id
	@Column(name = "ID_CAR_TYPE")
	private String idCarType;
	
	@Column(name = "TYPE_NAME")
	private String typeName;

	public String getIdCarType() {
		return idCarType;
	}

	public void setIdCarType(String idCarType) {
		this.idCarType = idCarType;
	}

	public String getTypeName() {
		return typeName;
	}

	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}

	
	
	

}
