package test.UC2;

import model.booking.Booking;
import model.user.Credentials;
import model.user.User;
import org.junit.Before;
import org.junit.Test;

import controller.client.CheckoutDetails;
import controller.client.ClientView;

import java.util.Date;

import static org.junit.Assert.assertEquals;



public class CheckoutDetailsTest {

    private Booking booking;
    private User user;
    private ClientView clientView;

    private CheckoutDetails checkoutDetails;

    @Before
    public void setUp() {
        booking = new Booking(1, new Date(), 1, 2, 19, 23, "ACE-2", "rafd47@my.yorku.ca");
        Credentials newCredentials = new Credentials("rafd47@my.yorku.ca", "1234567", "MANAGER");
        user = new User(newCredentials);
        clientView = new ClientView(user);
    }


    @Test
    public void testConstructor() {
        checkoutDetails = new CheckoutDetails(booking, clientView);
        assertEquals(booking, checkoutDetails.currentString);
        assertEquals(clientView, checkoutDetails.clientView);
    }


}