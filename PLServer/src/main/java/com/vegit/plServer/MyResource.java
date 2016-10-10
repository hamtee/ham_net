
package com.vegit.plServer;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

/** 
 * Example resource class hosted at the URI path "/myresource"
 */
@Path("/myresource")
public class MyResource {
	
	static final Logger log = LogManager.getLogger(MyResource.class);
    
    /** Method processing HTTP GET requests, producing "text/plain" MIME media
     * type.
     * @return String that will be send back as a response of type "text/plain".
     */
    @GET 
    @Produces("text/plain")
    public String getIt() {
    	log.trace("getIT requested ...");
        return "Hi there!";
    }
}
