package strategy;


public class NonFacultyParkingRate implements ParkingRateStrategy {
    private final double RATE_PER_HOUR = 10;

    @Override
    public double calculateRate(double duration) {
        return RATE_PER_HOUR * duration;
    }
}

