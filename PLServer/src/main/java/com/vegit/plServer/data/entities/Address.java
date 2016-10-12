package com.vegit.plServer.data.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long _id;
	
	@Column(name = "Street_Number")
	private Long streetNumber;
	
	@Column(name = "Street_Name")
	private String streetName;
	
	@Column(name = "Town")
	private String town;
	
	@Column(name = "Country")
	private String country;
	
	//Constructor
	public Address(){
		
	}
	
	public Address(long streetNumber, String streetName, String town, String country) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.town = town;
		this.country = country;
	}

	//Setters and Getters
	public long get_id() {
		return _id;
	}

	public void set_id(long _id) {
		this._id = _id;
	}
	
	public long getStreetNumber() {
		return streetNumber;
	}

	public void setStreetNumber(long streetNumber) {
		this.streetNumber = streetNumber;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getTown() {
		return town;
	}

	public void setTown(String town) {
		this.town = town;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
}
