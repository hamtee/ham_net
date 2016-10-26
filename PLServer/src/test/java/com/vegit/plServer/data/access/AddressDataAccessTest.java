package com.vegit.plServer.data.access;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

import com.vegit.plServer.data.entities.Address;

@ContextConfiguration(locations = "/plServer-context.xml")
public class AddressDataAccessTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private IAddressDataAccess addressDataAccess;
	
	@Test
	public void addAddressTest(){
		addressDataAccess.addAddress(new Address(92, "Boulevard Barbes", "Paris", "France"));
	}

}
