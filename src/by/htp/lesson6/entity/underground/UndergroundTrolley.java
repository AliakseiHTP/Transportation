package by.htp.lesson6.entity.underground;

public class UndergroundTrolley extends Underground {
    private final String Rails;
    private final String NAME;
    private final int SPEED;

    public UndergroundTrolley(double dDistance) {
        super(dDistance);
        this.Rails = "rails";
        this.NAME = "Underground trolley";
        this.SPEED = 420;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return Rails;
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
