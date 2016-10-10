package com.vegit.plServer.data.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Address {
	
	@Id
	@GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
	private long id;
	
	private long streetNumber;
	
	private String streetName;
	
	private String town;
	
	private String country;
	
	//Constructor
	public Address(long streetNumber, String streetName, String town, String country) {
		this.streetNumber = streetNumber;
		this.streetName = streetName;
		this.town = town;
		this.country = country;
	}

	//Setters and Getters
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
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
