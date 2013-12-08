package com.usesoft.codestorys03e01.cabin.server.domain.cabin;

import java.util.ArrayList;
import java.util.List;

import com.usesoft.codestorys03e01.cabin.server.domain.movement.Action;

public class ToFloorIntroductionSequence extends IntroductionSequence
{

    private int targetFloor;

    public ToFloorIntroductionSequence(int floor)
    {
        this.targetFloor = floor;
        List<Action> list = new ArrayList<>();
        for (int i = 0; i < Math.abs(floor); i++)
        {
            if (floor >= 0)
                list.add(Action.UP);
            else
                list.add(Action.DOWN);
        }

        setSequence(list);
    }

    @Override
    public int getPureSequenceIndex()
    {
        int bot = Context.INSTANCE.getBottomFloor();
        int top = Context.INSTANCE.getTopFloor();

        if (targetFloor >= 0)
        {
            return Math.abs(bot) * 3 + targetFloor * 3;
        } else
        {

            return Math.abs(bot - targetFloor) * 3;
        }
    }
}
