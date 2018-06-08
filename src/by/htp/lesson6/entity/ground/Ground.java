package by.htp.lesson6.entity.ground;

import by.htp.lesson6.entity.mainClass.Transport;

public abstract class Ground extends Transport {
    protected final double dCostFactor;

    public Ground(double dDistance) {
        super(dDistance);
        this.dCostFactor = 1.2;
    }

}