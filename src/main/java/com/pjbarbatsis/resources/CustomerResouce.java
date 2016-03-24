package com.pjbarbatsis.resources;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 * Created by Peeta on 3/24/2016.
 */

@Path("/customer/{name}")
public class CustomerResouce {

    @GET
    public String getGreeting(@PathParam("name") String name) {
        return "Hello, " + name + "!\n";
    }
}
