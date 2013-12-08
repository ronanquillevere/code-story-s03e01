package com.usesoft.codestorys03e01.cabin.server.domain.cabin;

import java.util.ArrayList;
import java.util.List;

import com.usesoft.codestorys03e01.cabin.server.domain.movement.Action;

public abstract class IntroductionSequence
{
    private List<Action> sequence = new ArrayList<>();
    private int index;

    public Action next()
    {
        if (index < sequence.size())
        {
            Action action = sequence.get(index);
            index++;
            return action;
        }
        return null;
    }

    public boolean isFinished()
    {
        return index >= sequence.size();
    }

    public void setSequence(List<Action> sequence)
    {
        if (sequence != null)
            this.sequence.addAll(sequence);
    }

    public abstract int getPureSequenceIndex();

    public void reset()
    {
        index = 0;
    }
}
