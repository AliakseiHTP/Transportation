package by.htp.lesson6.entity.air;

public class MiniPlane extends Air {
    private final String WINGS;
    private final String NAME;
    private final int SPEED;

    public MiniPlane(double dDistance) {
        super(dDistance);
        this.WINGS = "wings";
        this.NAME = "Mini plane";
        this.SPEED = 900;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return WINGS;
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
