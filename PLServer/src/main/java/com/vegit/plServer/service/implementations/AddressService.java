package com.vegit.plServer.service.implementations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.vegit.plServer.data.access.IAddressDataAccess;
import com.vegit.plServer.data.entities.Address;
import com.vegit.plServer.service.IAddressService;

@Service("addressService")
public class AddressService implements IAddressService {

	private static final Logger log = LogManager.getLogger(AddressService.class);
	
	@Autowired
	private IAddressDataAccess addressDataAccess;
	
	public AddressService(){
		log.debug("address service instatiated ...");
	}
	
	@Override
	public void createAddress(long streetNum, String streetName, String town, String country) {
		log.debug("creating address through adress service ...");
		addressDataAccess.addAddress(new Address(streetNum, streetName, town, country));
	}

	public IAddressDataAccess getAddressDataAccess() {
		return addressDataAccess;
	}

	public void setAddressDataAccess(IAddressDataAccess addressDataAccess) {
		this.addressDataAccess = addressDataAccess;
	}

}
