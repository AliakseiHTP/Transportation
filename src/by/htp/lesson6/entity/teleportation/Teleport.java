package by.htp.lesson6.entity.teleportation;

import by.htp.lesson6.entity.mainClass.Transport;

public class Teleport extends Transport {
    private final String Cabin;
    private final String NAME;
    private final int SPEED;
    protected final double dCostFactor;

    public Teleport(double dDistance) {
        super(dDistance);
        this.Cabin = "сabin";
        this.NAME = "Teleport";
        this.SPEED = 1500;
        this.dCostFactor = 35;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return Cabin;
    }

    @Override
    public String getName() {
        return NAME;
    }

    @Override
    public double getTime() {
        return getDistance() / SPEED;
    }
}