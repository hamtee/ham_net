package com.vegit.plServer.data.access;

import com.vegit.plServer.data.entities.Address;

public interface IAddressDataAccess {
	
	public void addAddress(Address address);
	
	public Address getAddressById(String id);
	
	public void updateAddress(Address address);
	
	public void deleteAddress(Address address);

}
