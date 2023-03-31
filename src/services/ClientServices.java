package services;

import model.booking.Booking;
import model.parking.ParkingLot;
import model.parking.ParkingSpace;
import repo.BookingRepository;
import repo.ParkingRepository;
import repo.RepositoryProvider;

import java.util.ArrayList;
import java.util.List;

public class ClientServices {

    private static ClientServices clientServices = new ClientServices();
    RepositoryProvider repositoryProvider = new RepositoryProvider();
    private ParkingRepository parkingRepository = repositoryProvider.getParkingRepository();
    private BookingRepository bookingRepository = repositoryProvider.getBookingRepository();

    private ClientServices() {

    }

    public static ClientServices getInstance() {
        return clientServices;
    }

    public ParkingLot getParkingLotByAddress(String address) {
        List<ParkingLot> parkingLotList = parkingRepository.getAllParkingLots();
        for (ParkingLot lot : parkingLotList) {
            if (lot.getLocation().equalsIgnoreCase(address)) {
                return lot;
            }
        }
        return null;
    }

    public boolean bookParkingSpace(Booking booking) {


        ParkingLot parkingLot = null;
        List<ParkingLot> parkingLotList = parkingRepository.getAllParkingLots();
        for (ParkingLot lot : parkingLotList) {
            if (lot.getLotID() == booking.getLotId()) {
                parkingLot = lot;
                break;
            }
        }
        if (parkingLot == null)
            return false;
        ParkingSpace currentSpace = null;
        for (ParkingSpace space : parkingLot.getParkingSpaces()) {
            if (space.getSpaceID() == booking.getSpaceId()) {
                currentSpace = space;
                break;
            }
        }
        if (currentSpace == null)
            return false;
        
        if (currentSpace.getStatus() == false) 
        	return false; 
        
        
        currentSpace.setBooking(booking);

        parkingRepository.updateParkingLots(parkingLotList);
        List<Booking> bookings = bookingRepository.getAllBookings();
        bookings.add(booking);
        bookingRepository.updateBookings(bookings);
        return true;
    }

    public boolean cancenlBooking(int id) {
        List<Booking> bookings = bookingRepository.getAllBookings();
        Booking booking = null;
        for (Booking bookinga : bookings) {
            if (bookinga.getId() == id) {
                booking = bookinga;
            }
        }
        ParkingLot parkingLot = null;
        List<ParkingLot> parkingLotList = parkingRepository.getAllParkingLots();
        for (ParkingLot lot : parkingLotList) {
            if (lot.getLotID() == booking.getLotId()) {
                parkingLot = lot;
                break;
            }
        }
        if (parkingLot == null)
            return false;
        ParkingSpace currentSpace = null;
        for (ParkingSpace space : parkingLot.getParkingSpaces()) {
            if (space.getSpaceID() == booking.getSpaceId()) {
                currentSpace = space;
                break;
            }
        }
        if (currentSpace == null)
            return false;

        currentSpace.setBooking(new Booking());

        bookings.remove(booking);
        bookingRepository.updateBookings(bookings);
        parkingRepository.updateParkingLots(parkingLotList);
        return true;

    }

    public List<Booking> getAllBookings() {
        return bookingRepository.getAllBookings();
    }

    public boolean updateBooking(int id, int hrs) {
        List<Booking> bookings = bookingRepository.getAllBookings();
        Booking booking = null;
        for (Booking bookinga : bookings) {
            if (bookinga.getId() == id) {
                booking = bookinga;
            }
        }
        if (booking == null)
            return false;

        booking.setEndTime(booking.getEndTime() + hrs);
        bookingRepository.updateBookings(bookings);
        return true;
    }

    public List<Booking> getAllUsersBookings(String email) {
        List<Booking> clientBookings = new ArrayList<>();
        for (Booking booking : bookingRepository.getAllBookings()) {
            if (booking.getEmail().equalsIgnoreCase(email)) {
                clientBookings.add(booking);
            }
        }
        return clientBookings;
    }


    public List<String> getAllLocations() {
        List<String> locations = new ArrayList<>();
        List<ParkingLot> parkingLotList = parkingRepository.getAllParkingLots();
        for (ParkingLot lot : parkingLotList) {
        	if (lot.getStatus()) 
        		locations.add(lot.getLocation());
        }
        return locations;
    }

    public Booking getBookingById(int id) {
        for (Booking booking : bookingRepository.getAllBookings()) {
            if (booking.getId() == id) {
                return booking;
            }
        }
        return null;
    }

    public boolean updateCompleteBooking(Booking newbooking) {
        List<Booking> bookings = bookingRepository.getAllBookings();
        for (Booking booking : bookings) {
            if (booking.getId() == newbooking.getId()) {
                bookings.remove(booking);
                bookings.add(newbooking);
                cancenlBooking(newbooking.getId());
                bookParkingSpace(newbooking);
                bookingRepository.updateBookings(bookings);
                return true;
            }
        }
        return false;

    }


    public String getParkingSpaceById(int lotId, int spaceId) {
        ParkingLot parkingLot = null;
        List<ParkingLot> parkingLotList = parkingRepository.getAllParkingLots();
        for (ParkingLot lot : parkingLotList) {
            if (lot.getLotID() == lotId) {
                parkingLot = lot;
                break;
            }
        }
        if (parkingLot == null)
            return "There is no Such Parking Lot";

        ParkingSpace currentSpace = null;
        for (ParkingSpace space : parkingLot.getParkingSpaces()) {
            if (space.getSpaceID() == spaceId) {
                currentSpace = space;
                break;
            }
        }
        if (currentSpace != null) {
        	if (currentSpace.getBooking() == null) {
        		return "success";
        	}
            if (currentSpace.getBooking().getEmail() == null) {
            	
                return "success";
            } else {
                return "This parking Space is not available";
            }
        }
        return "Give Id for parking Space is wrong";

    }

    public String disableParkingSpaceById(int lotId, int spaceId) {
        ParkingLot parkingLot = null;
        List<ParkingLot> parkingLotList = parkingRepository.getAllParkingLots();
        for (ParkingLot lot : parkingLotList) {
            if (lot.getLotID() == lotId) {
                parkingLot = lot;
                break;
            }
        }
        if (parkingLot == null)
            return "There is no Such Parking Lot";

        ParkingSpace currentSpace = null;
        for (ParkingSpace space : parkingLot.getParkingSpaces()) {
            if (space.getSpaceID() == spaceId) {
                currentSpace = space;
                break;
            }
        }
        if (currentSpace != null) {
                String result= currentSpace.disableParkingSpace();
                parkingRepository.updateParkingLots(parkingLotList);
                return result;
        }
        return "Give Id for parking Space is wrong";

    }

    public String enableParkingSpaceById(int lotId, int spaceId) {
        ParkingLot parkingLot = null;
        List<ParkingLot> parkingLotList = parkingRepository.getAllParkingLots();
        for (ParkingLot lot : parkingLotList) {
            if (lot.getLotID() == lotId) {
                parkingLot = lot;
                break;
            }
        }
        if (parkingLot == null)
            return "There is no Such Parking Lot";

        ParkingSpace currentSpace = null;
        for (ParkingSpace space : parkingLot.getParkingSpaces()) {
            if (space.getSpaceID() == spaceId) {
                currentSpace = space;
                break;
            }
        }
        if (currentSpace != null) {
            String result= currentSpace.enableParkingSpace();
            parkingRepository.updateParkingLots(parkingLotList);
            return result;
        }
        return "Give Id for parking Space is wrong";

    }

}
