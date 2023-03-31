package strategy;

public class FacultyParkingRate implements ParkingRateStrategy {
    private final double RATE_PER_HOUR = 8;

    @Override
    public double calculateRate(double duration) {
        return RATE_PER_HOUR * duration;
    }
}
