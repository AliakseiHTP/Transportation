package by.htp.lesson6.entity.air;

public class Slingshot extends Air {
    private final String Ball;
    private final String NAME;
    private final int SPEED;

    public Slingshot(double dDistance) {
        super(dDistance);
        this.Ball = "ball";
        this.NAME = "Slingshot";
        this.SPEED = 500;
    }

    @Override
    public double getTime() {
        return getDistance() / SPEED;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return Ball;
    }

    @Override
    public String getName() {
        return NAME;
    }
}
