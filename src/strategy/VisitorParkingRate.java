package strategy;

public class VisitorParkingRate implements ParkingRateStrategy {
    private final double RATE_PER_HOUR = 15;

    @Override
    public double calculateRate(double duration) {
        return RATE_PER_HOUR * duration;
    }
}