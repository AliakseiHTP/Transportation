package by.htp.lesson6.entity.water;

public class UnderwaterTrain extends Water{
    private final String AerodynamicTube;
    private final String NAME;
    private final int SPEED;

    public UnderwaterTrain(double dDistance) {
        super(dDistance);
        this.AerodynamicTube = "aerodynamic tube";
        this.NAME = "Underwater train";
        this.SPEED = 420;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return AerodynamicTube;
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
