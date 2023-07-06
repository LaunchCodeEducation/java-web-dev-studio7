package org.launchcode.studio7;

public abstract class BaseDisc {
    private int totalCapacity;

    private int availableCapacity;
    private int usedCapacity;
    private String name;
    public BaseDisc(int totalCapacity,String name)
    {
        this.totalCapacity = totalCapacity;
        this.name = name;
    }
}
