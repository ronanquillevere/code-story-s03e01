package com.usesoft.codestorys03e01.cabin.server.domain.cabin;

import java.util.List;

import com.usesoft.codestorys03e01.cabin.server.domain.movement.Action;
import com.usesoft.codestorys03e01.cabin.server.domain.movement.SequenceUtil;

public class Cabin
{
    private List<Action> pureSequence;
    private final IntroductionSequence intro;
    int sequencePosition;
    boolean introFinished;
    private int floor;
    private boolean open;
    private Action lastAction;

    public Cabin(IntroductionSequence intro)
    {
        this.intro = intro;
        pureSequence = SequenceUtil.generateSequence();
    }

    public Action next()
    {
        Action action = computeNextAction();
        lastAction = action;
        computeState(action);
        return action;
    }

    private void computeState(Action action)
    {
        switch (action)
        {
        case CLOSE:
            open = false;
            break;
        case DOWN:
            floor--;
            break;
        case OPEN:
            open = true;
            break;
        case UP:
            floor++;
            break;
        default:
            break;
        }
    }

    private Action computeNextAction()
    {
        Action action;

        if (intro != null && !intro.isFinished())
        {
            action = introAction();
        } else
        {
            action = classicAction();
        }

        return action;
    }

    private Action classicAction()
    {
        if (!introFinished && intro != null)
        {
            sequencePosition = intro.getPureSequenceIndex();
            introFinished = true;
        }
        Action action = pureSequence.get(sequencePosition++);
        if (sequencePosition > pureSequence.size() - 1)
            sequencePosition = 0;

        return action;
    }

    private Action introAction()
    {
        return intro.next();
    }

    public void reset()
    {
        sequencePosition = 0;
        introFinished = false;
        intro.reset();
    }

    public int getFloor()
    {
        return floor;
    }

    public boolean isOpen()
    {
        return open;
    }

    @Override
    public String toString()
    {
        return "floor;" + floor + ";open;" + open + ";action;" + lastAction;
    }
}
