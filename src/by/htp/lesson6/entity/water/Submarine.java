package by.htp.lesson6.entity.water;

public class Submarine extends Water{
    private final String Propellers;
    private final String NAME;
    private final int SPEED;

    public Submarine(double dDistance) {
        super(dDistance);
        this.Propellers = "propellers";
        this.NAME = "Submarine";
        this.SPEED = 250;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return Propellers;
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
