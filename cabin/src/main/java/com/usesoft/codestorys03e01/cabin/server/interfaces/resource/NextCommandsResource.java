package com.usesoft.codestorys03e01.cabin.server.interfaces.resource;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import com.usesoft.codestorys03e01.cabin.server.domain.cabin.CabinMaster;

@Path(URLConstants.API_VERSION_1 + URLConstants.NEXTCOMMANDS)
@Produces(MediaType.TEXT_PLAIN)
@Consumes(MediaType.TEXT_PLAIN)
public class NextCommandsResource
{

    @GET
    public String getObjects()
    {
        return nextCommands();
    }

    public static String nextCommands()
    {

        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < CabinMaster.INSTANCE.getCabinCount(); i++)
        {
            sb.append(CabinMaster.INSTANCE.getCabin(i).next()).append("\n");
        }

        return sb.toString();
    }


}
