package com.usesoft.codestorys03e01.cabin.server.domain.cabin;


public class Context
{
    public static final Context INSTANCE = new Context(-5, 48);
    private final int bottomFloor;
    private final int topFloor;

    private Context(int bottomFloor, int topFloor)
    {
        this.bottomFloor = bottomFloor;
        this.topFloor = topFloor;

    }

    public int getBottomFloor()
    {
        return bottomFloor;
    }

    public int getTopFloor()
    {
        return topFloor;
    }
}
