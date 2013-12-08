package com.usesoft.codestorys03e01.cabin.server.domain.cabin;

import java.util.ArrayList;
import java.util.List;

public class CabinMaster
{
    public static final CabinMaster INSTANCE = new CabinMaster(8);

    private final List<Cabin> cabins;

    private final int cabinCount;

    private CabinMaster(int nbCabins)
    {
        this.cabinCount = nbCabins;
        cabins = new ArrayList<>();

        // for (int i = 0; i < nbCabins; i++)
        // {
        cabins.add(new Cabin(new ToFloorIntroductionSequence(0)));
        cabins.add(new Cabin(new ToFloorIntroductionSequence(10)));
        cabins.add(new Cabin(new ToFloorIntroductionSequence(20)));
        cabins.add(new Cabin(new ToFloorIntroductionSequence(30)));
        cabins.add(new Cabin(new ToFloorIntroductionSequence(40)));
        cabins.add(new Cabin(new ToFloorIntroductionSequence(48)));
        cabins.add(new Cabin(new ToFloorIntroductionSequence(-3)));
        cabins.add(new Cabin(new ToFloorIntroductionSequence(-5)));
        // }
    }

    public Cabin getCabin(int cabinNumber)
    {
        return cabins.get(cabinNumber);
    }

    public int getCabinCount()
    {
        return cabinCount;
    }
}
