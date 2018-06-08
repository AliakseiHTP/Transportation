package by.htp.lesson6.entity.mainClass;

public abstract class Transport {
    protected double dDistance;

    public Transport(double dDistance) {
        this.dDistance = dDistance;
    }

    public double getDistance() {
        return dDistance;
    }

    public abstract String getMainPart();

    public abstract String getName();

    public abstract double getTime();

    public abstract double getCost();

}
