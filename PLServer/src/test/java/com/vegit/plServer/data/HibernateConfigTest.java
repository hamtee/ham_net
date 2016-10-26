package com.vegit.plServer.data;

import static org.junit.Assert.assertNotNull;

import org.hibernate.SessionFactory;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.AbstractJUnit4SpringContextTests;

@ContextConfiguration(locations = "/plServer-context.xml")
public class HibernateConfigTest extends AbstractJUnit4SpringContextTests{

	@Autowired
    private SessionFactory sessionFactory;
 
    @Test
    public void testHibernateConfiguration() {
        // Spring IOC container instantiated and prepared sessionFactory
        assertNotNull (sessionFactory); 
    }

}
