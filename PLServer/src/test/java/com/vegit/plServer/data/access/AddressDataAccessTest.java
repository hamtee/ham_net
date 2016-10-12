package com.vegit.plServer.data.access;

import static org.junit.Assert.*;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

import com.vegit.plServer.data.entities.Address;

public class AddressDataAccessTest {
	
	private static EntityManagerFactory entityManagerFactory;

    @BeforeClass
    public static void setUpEntityManagerFactory() {
        entityManagerFactory = Persistence.createEntityManagerFactory( "fongodb-ogm-jpa-plserver" );
    }

    @AfterClass
    public static void closeEntityManagerFactory() {
        entityManagerFactory.close();
    }

	@Test
	public void canPersistAndLoadAddress() {
		
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		Address address = new Address(92, "Boulevard Barbes", "Paris", "France");
		
		entityManager.getTransaction().begin();
		
		entityManager.persist(address);
		
		entityManager.getTransaction().commit();
		
		entityManager.close();
	   
		entityManager = entityManagerFactory.createEntityManager();
		
		Address loadedAddress = entityManager.find(Address.class, address.get_id());
		
		assertNotNull(loadedAddress);
		
		entityManager.close();
		
	}

}
