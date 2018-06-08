package by.htp.lesson6.entity.water;

import by.htp.lesson6.entity.mainClass.Transport;

public abstract class Water extends Transport {
    protected final double dCostFactor;

    public Water(double dDistance) {
        super(dDistance);
        this.dCostFactor = 1.8;
    }

}