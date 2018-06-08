package by.htp.lesson6.entity.underground;

import by.htp.lesson6.entity.mainClass.Transport;

public abstract class Underground extends Transport {
    protected final double dCostFactor;

    public Underground(double dDistance) {
        super(dDistance);
        this.dCostFactor = 1.5;
    }

}