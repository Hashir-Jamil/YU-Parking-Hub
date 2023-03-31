package strategy;

public class StudentParkingRate implements ParkingRateStrategy {
    private final double RATE_PER_HOUR = 5;

    @Override
    public double calculateRate(double duration) {
        return RATE_PER_HOUR * duration;
    }
}


