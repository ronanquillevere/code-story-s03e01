package com.usesoft.codestorys03e01.cabin.server.domain.cabin;

import static org.fest.assertions.api.Assertions.assertThat;

import org.junit.Test;

import com.usesoft.codestorys03e01.cabin.server.interfaces.resource.NextCommandsResource;

public class TestCabin
{
    @Test
    public void test()
    {
        for (int i = 0; i < 10000; i++)
        {
            String commands = NextCommandsResource.nextCommands();
            System.out.println("-- Iteration " + i);

            for (int i1 = 0; i1 < CabinMaster.INSTANCE.getCabinCount(); i1++)
            {


                Cabin cabin = CabinMaster.INSTANCE.getCabin(i1);

                // if (i1 == 5)
                // {
                // System.out.println("Cabin number " + (i1 + 1));
                // System.out.println(cabin);
                // }

                assertThat(cabin.getFloor()).isLessThanOrEqualTo(Context.INSTANCE.getTopFloor());
                assertThat(cabin.getFloor()).isGreaterThanOrEqualTo(Context.INSTANCE.getBottomFloor());
            }

        }
    }
}
