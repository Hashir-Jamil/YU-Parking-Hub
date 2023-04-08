package test.UC2;


import org.junit.Assert;

import org.junit.Before;
import org.junit.Test;

import model.booking.Booking;

import java.util.Calendar;
import java.util.Date;


import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BookingTest {

    private Booking booking;

    @Before
    public void setUp() {
        booking = new Booking(1, new Date(), 1, 2, 19, 23, "ACE-2", "rafd47@my.yorku.ca");
    }

    @Test
    public void testGetTotalCost() {
        assertEquals(20, booking.getTotalCost(), 0.0);
    }

  

    @Test
    public void testMultiple_Methods() {
        Assert.assertEquals(19, booking.getStartTime());
        booking.setStartTime(20);
        assertEquals(20, booking.getStartTime());
        assertEquals(23, booking.getEndTime());
        assertEquals("ACE-2", booking.getLicensePlate());
        booking.setLicensePlate("KING-5");
        assertEquals("KING-5", booking.getLicensePlate());
        assertEquals(20, booking.getCost(), 0.0);
        booking.setCost(50);
        assertEquals(50, booking.getCost(), 0.0);
        booking.setStatus("Valid");
        assertEquals("Valid", booking.getStatus());
        assertEquals("rafd47@my.yorku.ca", booking.getEmail());
        assertEquals(1, booking.getLotId());
        assertEquals(2, booking.getSpaceId());
    }

    @Test
    public void testgetEndDateTime() {
        Calendar calendar = Calendar.getInstance();
        Date date3 =  new Date();
        Date date4 =  booking.getEndDateTime();
        assertTrue(date4.after(date3));
    }
}