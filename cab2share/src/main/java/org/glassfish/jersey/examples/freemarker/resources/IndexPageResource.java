package org.glassfish.jersey.examples.freemarker.resources;

import java.util.HashMap;
import java.util.Map;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.glassfish.jersey.server.mvc.Viewable;
import org.springframework.beans.factory.annotation.Autowired;

import com.finnler.cab2share.service.HomePageDataService;

@Path("/")
public class IndexPageResource {
	
	@Autowired
	private HomePageDataService homePageDataService;
	
	 @GET
	 @Produces(MediaType.TEXT_HTML)
	 public Viewable getAutoTemplate() {
        final Map<String, Object> map = new HashMap<String, Object>();
        map.put("user", "Pavel");
//        map.put("headerLabels", homePageDataService.getHeaders());

        // template name is derived from resource class name
        return new Viewable("/org/glassfish/jersey/examples/freemarker/resources/IndexPageResource.ftl", map);
	 }
	 
}
