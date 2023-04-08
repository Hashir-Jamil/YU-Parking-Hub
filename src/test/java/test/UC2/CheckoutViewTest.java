package test.UC2;

import controller.checkout.CheckoutView;
import controller.client.ViewDetails;

import model.booking.Booking;
import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static org.junit.Assert.assertEquals;


public class CheckoutViewTest {


    private Booking booking;

    private CheckoutView checkoutView;

    @Before
    public void setUp() {
        booking = new Booking(1, new Date(), 1, 2, 19, 23, "ACE-2", "rafd47@my.yorku.ca");
            }

    @Test
    public void testCheckoutView_Constructor() {

        checkoutView = new CheckoutView(booking);
        assertEquals(booking, checkoutView.currentBooking);
    }
}
