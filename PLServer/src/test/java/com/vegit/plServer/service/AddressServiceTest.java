package com.vegit.plServer.service;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = "/plServer-context.xml")
public class AddressServiceTest extends AbstractJUnit4SpringContextTests{
	
	@Autowired
	private IAddressService addressService;

	@Test
	public void test() {
		addressService.createAddress(63, "Rue Montcalm", "Paris", "France");
	}

}
