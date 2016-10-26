package com.vegit.plServer.data.access.implementations;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.vegit.plServer.data.access.IAddressDataAccess;
import com.vegit.plServer.data.entities.Address;

@Repository("addressDataAccess")
@Transactional
public class AddressDataAccess implements IAddressDataAccess{
	
	private static final Logger log = LogManager.getLogger(AddressDataAccess.class);
	
	@Autowired
	private SessionFactory sessionFactory;
	
	public AddressDataAccess(){
		log.debug("Address data access instantiated ...");
	}

	@Override
	public void addAddress(Address address) {
		
		Session session  = this.sessionFactory.getCurrentSession();
		
		session.persist(address);
	
	}

	@Override
	public Address getAddressById(String id) {
		return null;
	}

	@Override
	public void updateAddress(Address address) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void deleteAddress(Address address) {
		throw new UnsupportedOperationException();
	}

	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

}
