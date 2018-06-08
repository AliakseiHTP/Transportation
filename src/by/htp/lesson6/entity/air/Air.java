package by.htp.lesson6.entity.air;

import by.htp.lesson6.entity.mainClass.Transport;

public abstract class Air extends Transport {
    protected final double dCostFactor;

    public Air(double dDistance) {
        super(dDistance);
        this.dCostFactor = 14.5;
    }

}
