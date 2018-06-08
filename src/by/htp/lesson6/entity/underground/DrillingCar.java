package by.htp.lesson6.entity.underground;

public class DrillingCar extends Underground {
    private final String DrillBlades;
    private final String NAME;
    private final int SPEED;

    public DrillingCar(double dDistance) {
        super(dDistance);
        this.DrillBlades = "drill blades";
        this.NAME = "Drilling car";
        this.SPEED = 180;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return DrillBlades;
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
