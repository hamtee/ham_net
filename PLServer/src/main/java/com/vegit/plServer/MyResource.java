
package com.vegit.plServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.vegit.plServer.service.IAddressService;

/** 
 * Example resource class hosted at the URI path "/myresource"
 */

@Component
@Path("/myresource")
public class MyResource {
	
	private static final Logger log = LogManager.getLogger(MyResource.class);
	
	@Autowired
	private IAddressService addressService;
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("application/json")
    public String getIt() {
    	log.trace("getIT requested ..." + addressService);
    	
    	addressService.createAddress(92, "Boulevard Barbes", "Paris", "France");
        
    	return "Hi there!";
    }
    
}
