package com.usesoft.codestorys03e01.cabin.server.interfaces.resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.usesoft.codestorys03e01.cabin.server.domain.cabin.CabinMaster;

@Path(URLConstants.API_VERSION_1 + URLConstants.RESET)
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class ResetResource
{

    @GET
    public String getObjects()
    {
        int cabinCount = CabinMaster.INSTANCE.getCabinCount();

        for (int i = 0; i < cabinCount; i++)
        {
            CabinMaster.INSTANCE.getCabin(i).reset();
        }

        return "";
    }
}
