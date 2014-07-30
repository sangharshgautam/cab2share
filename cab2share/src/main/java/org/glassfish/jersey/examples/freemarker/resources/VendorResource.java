package org.glassfish.jersey.examples.freemarker.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.springframework.beans.factory.annotation.Autowired;

import com.finnler.cab2share.service.VendorService;

@Path("/vendor")
public class VendorResource {

	@Autowired
	private VendorService vendorService;
	
	/*@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response showAll(){
		vendorService.findAll();
	}*/
}
