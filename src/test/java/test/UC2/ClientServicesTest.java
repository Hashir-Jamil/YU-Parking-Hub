package test.UC2;


import model.booking.Booking;
import model.parking.ParkingLot;
import model.parking.ParkingSpace;
import services.ClientServices;

import org.junit.Before;
import org.junit.Test;

import java.util.*;

import static org.junit.Assert.*;

public class ClientServicesTest {


        ClientServices  clientServices = ClientServices.getInstance();


    @Test
    public void testClientServices_Test() {

        ParkingLot result = clientServices.getParkingLotByAddress("aaa");
        assertNotNull(result);

        Booking booking = new Booking(1, new Date(), 1, 2, 19, 23, "ACE-2", "rafd47@my.yorku.ca");
        ParkingLot lot = new ParkingLot(1, "aaa");
        boolean result1 = clientServices.bookParkingSpace(booking);
        assertFalse(result1);


        List<Booking> result3 = clientServices.getAllBookings();
        assertNotNull(result3);

        boolean result4 = clientServices.updateBooking(1, 2);
        assertTrue(result4);

        List<Booking> result5 = clientServices.getAllUsersBookings("rafd47@my.yorku.ca");
        assertNotNull(result5);

        List<String> result6 = clientServices.getAllLocations();
        assertEquals(List.of("aaa", "SuperLot", "Nice"), result6);

        Booking result7 = clientServices.getBookingById(1);
        assertEquals(1, result7.getId());

        Booking newbooking = new Booking(1, new Date(), 1, 2, 19, 23, "ACE-2", "rafd47@my.yorku.ca");
        boolean result8 = clientServices.updateCompleteBooking(newbooking);
        assertTrue(result8);

        String result9 = clientServices.getParkingSpaceById(1, 1);
        assertEquals("success", result9);

        String result10 = clientServices.disableParkingSpaceById(3, 3);
        assertEquals("Failure: Parking Space 3 has active bookings. Parking Space has not been disabled.", result10);

        String result11 = clientServices.enableParkingSpaceById(1, 1);
        assertEquals("Parking Space 1 is already enabled.", result11);
    }


}