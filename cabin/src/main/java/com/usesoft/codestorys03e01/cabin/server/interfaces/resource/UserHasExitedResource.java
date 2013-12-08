package com.usesoft.codestorys03e01.cabin.server.interfaces.resource;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path(URLConstants.API_VERSION_1 + URLConstants.USERHASEXITED)
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class UserHasExitedResource
{

    @GET
    public String getObjects()
    {
        return "";
    }
}
