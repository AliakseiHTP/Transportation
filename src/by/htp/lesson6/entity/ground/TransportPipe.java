package by.htp.lesson6.entity.ground;

public class TransportPipe extends Ground {
    private final String Pipe;
    private final String NAME;
    private final int SPEED;

    public TransportPipe(double dDistance) {
        super(dDistance);
        this.Pipe = "pipe";
        this.NAME = "Transport pipe";
        this.SPEED = 100;
    }

    @Override
    public double getCost() {
        return getTime() * dCostFactor;
    }

    @Override
    public String getMainPart() {
        return Pipe;
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
