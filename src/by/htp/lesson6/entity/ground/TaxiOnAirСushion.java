package by.htp.lesson6.entity.ground;

public class TaxiOnAirСushion extends Ground {
    private final String AirCushion;
    private final String NAME;
    private final int SPEED;

    public TaxiOnAirСushion(double dDistance) {
        super(dDistance);
        this.AirCushion = "air cushion";
        this.NAME = "Taxi on an air cushion";
        this.SPEED = 140;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return AirCushion;
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
