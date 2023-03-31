package repo;

public class RepositoryProvider {

    private BookingRepository bookingRepository;
    private UserRepository userRepository;
    private ParkingRepository parkingRepository;

    public RepositoryProvider() {
        this.bookingRepository = new BookingRepository();
        this.userRepository = new UserRepository();
        this.parkingRepository = new ParkingRepository();
    }


    public BookingRepository getBookingRepository() {
        return bookingRepository;
    }

    public UserRepository getUserRepository() {
        return userRepository;
    }

    public ParkingRepository getParkingRepository() {
        return parkingRepository;
    }
}
