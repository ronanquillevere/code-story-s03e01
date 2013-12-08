package com.usesoft.codestorys03e01.cabin.server.interfaces.resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.usesoft.codestorys03e01.cabin.server.domain.cabin.CabinMaster;

@Path(URLConstants.API_VERSION_1 + URLConstants.NEXTCOMMAND)
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class NextCommandResource
{

    @GET
    public String getObjects()
    {
        StringBuilder sb = new StringBuilder();

        sb.append(CabinMaster.INSTANCE.getCabin(0).next());

        return sb.toString();
    }


}
