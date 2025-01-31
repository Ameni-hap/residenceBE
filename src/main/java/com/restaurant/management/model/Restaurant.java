package com.restaurant.management.model;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;  
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;

import javax.persistence.OneToMany;

import javax.persistence.Table;  
 
@Entity  

@Table  

public class Restaurant {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column 
	private int id;  
	@Column  
	private String name;  
	@Column  
	private String adresse;  
	@Column  
	private String  phone;

   /*@OneToOne(cascade = CascadeType.ALL)
   @JoinColumn(name = "kf_plate")
   private Plate plate;*/
	
	/*@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "fk_rest_id", referencedColumnName="id")
	private List<Plate> plates;*/
   
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAdresse() {
		return adresse;
	}
	public void setAdresse(String adresse) {
		this.adresse = adresse;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public String toString() {
		return "Restaurant [id=" + id + ", name=" + name + ", adresse=" + adresse + ", phone=" + phone + ", getId()="
				+ getId() + ", getName()=" + getName() + ", getAdresse()=" + getAdresse() + ", getPhone()=" + getPhone()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}





}
