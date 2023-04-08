package test.UC2;


import javax.swing.*;

import org.junit.Before;
import org.junit.Test;

import controller.client.ViewDetails;
import model.booking.Booking;

import java.util.Date;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;


public class ViewDetailsTest {

    private Booking booking;
    private ViewDetails viewDetails;

    @Before
    public void setUp() {
        booking = new Booking(1, new Date(), 1, 2, 19, 23, "ACE-2", "rafd47@my.yorku.ca");

    }

    @Test
    public void TestViewDetails(){
        viewDetails = new ViewDetails(booking);
        assertEquals(booking, viewDetails.currentBooking);
    }
}