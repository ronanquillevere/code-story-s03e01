package com.usesoft.codestorys03e01.cabin.server.domain.movement;

import java.util.ArrayList;
import java.util.List;

import com.usesoft.codestorys03e01.cabin.server.domain.cabin.Context;

public class SequenceUtil
{

    private SequenceUtil()
    {
    }

    public static List<Action> generateSequence()
    {
        return generatePureSequence(Context.INSTANCE.getBottomFloor(), Context.INSTANCE.getTopFloor());
    }

    private static List<Action> generatePureSequence(int bottomFloor, int upperFloor)
    {
        ArrayList<Action> list = new ArrayList<>();

        for (int i = bottomFloor; i < upperFloor; i++)
        {
            list.add(Action.OPEN);
            list.add(Action.CLOSE);
            list.add(Action.UP);
        }

        for (int i = bottomFloor; i < upperFloor; i++)
        {
            list.add(Action.OPEN);
            list.add(Action.CLOSE);
            list.add(Action.DOWN);
        }

        return list;
    }

}
