package by.htp.lesson6.entity.air;

public class Jetpack extends Air {
    private final String Backpack;
    private final String NAME;
    private final int SPEED;

    public Jetpack(double dDistance) {
        super(dDistance);
        this.Backpack = "backpack";
        this.NAME = "Jetpack";
        this.SPEED = 400;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return Backpack;
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
