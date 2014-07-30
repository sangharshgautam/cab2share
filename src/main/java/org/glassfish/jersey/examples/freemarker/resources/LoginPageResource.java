package org.glassfish.jersey.examples.freemarker.resources;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.mvc.Viewable;

@Path("/login")
public class LoginPageResource {
	
	 @GET
	 @Produces(MediaType.TEXT_HTML)
	 public Viewable getLogin() {
        final Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", "Pavel");
        return new Viewable("/org/glassfish/jersey/examples/freemarker/resources/LoginPageResource.ftl", map);
	 }
	 
	 @POST
	 @Produces(MediaType.TEXT_HTML)
	 public Viewable doLogin() {
        final Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", "Pavel");
        return new Viewable("/org/glassfish/jersey/examples/freemarker/resources/HomePageResource.ftl", map);
	 }
	 
}
