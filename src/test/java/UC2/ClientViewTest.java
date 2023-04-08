package UC2;

import model.booking.Booking;

import model.parking.ParkingLot;
import model.parking.ParkingSpace;
import model.user.Credentials;
import model.user.User;
import org.junit.Before;
import org.junit.Test;

import controller.client.ClientView;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import static org.junit.Assert.assertEquals;

public class ClientViewTest {


    private User user;

    private ClientView clientView;

    @Before
    public void setUp() {
        Credentials newCredentials = new Credentials("rafd47@my.yorku.ca", "1234567", "MANAGER");
        user = new User(newCredentials);
        clientView = new ClientView(user);
    }

    @Test
    public void testLoadSpaceTable() {
        JTable spaceTable = new JTable();
        ParkingLot lot = new ParkingLot(1, "XYZ");

        List<ParkingSpace> spaces = new ArrayList<ParkingSpace>(100);
        for (int i = 1; i <= 100; i++) {
            spaces.add(new ParkingSpace(i));
        }

        clientView.loadSpaceTable(lot);

        //To check and verify if the space table was loaded correctly
        DefaultTableModel model = (DefaultTableModel) spaceTable.getModel();
        assertEquals(lot.getParkingSpaces().size(), 100);
        for (int i = 0; i < model.getRowCount(); i++) {
            ParkingSpace space = lot.getParkingSpaces().get(i);
            assertEquals(model.getValueAt(i, 0), space.getSpaceID());
            assertEquals(model.getValueAt(i, 1), lot.getLocation() + "-" + space.getSpaceID());
            if (space.hasBooking() && space.getStatus() && space.getBooking() != null && space.getBooking().getEmail() != null) {
                assertEquals(model.getValueAt(i, 2), "No");
            } else {
                assertEquals(model.getValueAt(i, 2), "Yes");
            }
        }
    }
}