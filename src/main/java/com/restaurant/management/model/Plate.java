package com.restaurant.management.model;


import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import javax.persistence.Table;
  
//mark class as an Entity   
@Entity  
//defining class name as Table name  
@Table 
//Defining book id as primary key 

public class Plate {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column  
	private int idPlate;  
	@Column  
	private String name;  
	@Column  
	private String price;  
	@Column  
	private String  description;
	
	
	
	public int getIdPlate() {
		return idPlate;
	}
	public void setIdPlate(int idPlate) {
		this.idPlate = idPlate;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPrice() {
		return price;
	}
	public void setPrice(String price) {
		this.price = price;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Plate [idPlate=" + idPlate + ", name=" + name + ", price=" + price + ", description=" + description
				+ ", getIdPlate()=" + getIdPlate() + ", getName()=" + getName() + ", getPrice()=" + getPrice()
				+ ", getDescription()=" + getDescription() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	

    
}
