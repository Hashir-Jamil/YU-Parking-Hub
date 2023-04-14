package UC2;

import model.booking.Booking;

import model.parking.ParkingLot;
import model.parking.ParkingSpace;
import model.user.Credentials;
import model.user.User;
import repo.RepositoryProvider;
import services.ClientServices;

import org.junit.Test;

import controller.client.ClientView;
import controller.client.ViewDetails;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static org.junit.Assert.*;

public class ClientViewTest {

    Credentials newCredentials = new Credentials("rafd47@my.yorku.ca", "1234567", "MANAGER");
    User user = new User(newCredentials);
    ClientView clientView = new ClientView(user);

    @Test
    public void clientViewTestActionEvents() {

        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Start Time");
        model.addColumn("End Time");
        model.addColumn("License Plate");
        model.addColumn("Cost");
        clientView.bookingTable.setModel(model);
        clientView.bookingTable.clearSelection();

        // Call the method
        clientView.extendBtnActionPerformed(null);

        // Check if the expected message is shown
        assertFalse(clientView.isVisible());
        
        Booking booking =
                new Booking(
                        1,
                        new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000),
                        1,
                        1,
                        10,
                        12,
                        "ABC123",
                        "rafd47@my.yorku.ca");
        ClientServices.getInstance().bookParkingSpace(booking);

        // Set up the booking table
        DefaultTableModel model1 = new DefaultTableModel();
        model1.addColumn("ID");
        model1.addColumn("Start Time");
        model1.addColumn("End Time");
        model1.addRow(
                new Object[]{
                        String.valueOf(booking.getId()), booking.getStartTime(), booking.getEndTime()
                });
        clientView.bookingTable.setModel(model1);
        clientView.bookingTable.setRowSelectionInterval(0, 0);

        // Call the method
        clientView.extendBtnActionPerformed(null);

        assertFalse(clientView.isVisible());
        
        List<Booking> bookings = new ArrayList<>();
        Booking booking1 =
                new Booking(
                        1,
                        new Date(System.currentTimeMillis() - 24 * 60 * 60 * 1000),
                        1,
                        1,
                        10,
                        12,
                        "ABC123",
                        "rafd47@my.yorku.ca");
        bookings.add(booking1);

        // Mock ClientServices
        ClientServices clientServices = ClientServices.getInstance();
        RepositoryProvider repositoryProvider = new RepositoryProvider();
        clientServices.bookingRepository = repositoryProvider.getBookingRepository();;

        // Prepare table
        DefaultTableModel model11 = new DefaultTableModel();
        model11.addColumn("ID");
        model11.addColumn("Start Time");
        model11.addColumn("End Time");
        model11.addRow(
                new Object[]{
                        String.valueOf(booking1.getId()), booking1.getStartTime(), booking1.getEndTime()
                });
        clientView.bookingTable.setModel(model11);

        // Select the row
        clientView.bookingTable.setRowSelectionInterval(0, 0);
        // data
        List<Booking> bookings1 = new ArrayList<>();
        Booking booking11 = new Booking(1, new Date(), 1, 1, 10, 12, "ABC123", "user1@example.com");
        Booking booking2 = new Booking(2, new Date(), 1, 2, 14, 16, "DEF456", "user2@example.com");
        bookings1.add(booking11);
        bookings1.add(booking2);

        // Mock ClientServices
        ClientServices clientServices1 = ClientServices.getInstance();
        clientServices1.bookingRepository.updateBookings(bookings1);

        // Set up the booking table
        DefaultTableModel model111 = (DefaultTableModel) clientView.bookingTable.getModel();
        model111.setRowCount(0);
        for (Booking booking111 : bookings1) {
            model111.addRow(
                    new Object[]{
                            String.valueOf(booking111.getId()),
                            booking111.getLicensePlate(),
                            booking111.getEmail(),
                            booking111.getStartDateTime(),
                            booking111.getEndDateTime(),
                            booking111.getTotalHours(),
                            booking111.getCost()
                    });
        }

        // Select a row in the booking table
        clientView.bookingTable.setRowSelectionInterval(0, 0);

        // Mock JOptionPane input dialog
        JOptionPane.showMessageDialog(null, "Enter Extra Hours: 2");

        // Call the extendBtnActionPerformed method
        clientView.extendBtnActionPerformed(null);

        // Verify the booking is extended
        Booking extendedBooking = clientServices1.getBookingById(1);
        
        clientView.checkoutBtn.setText("Update");
        clientView.currentBooking =
                new Booking(1, new Date(), 1, 1, 1, 2, "ABC123", "test@example.com");
        clientView.spaceTable.clearSelection();

        clientView.checkoutBtnActionPerformed(null);
        ParkingLot parkingLot = new ParkingLot(1, "Test Location");
        List<ParkingSpace> parkingSpaces = parkingLot.getParkingSpaces();
        parkingSpaces.get(0).setStatus(true);

        // Set up the ClientView components
        clientView.locationTf.setSelectedItem(parkingLot.getLocation());
        clientView.jDateChooser1.setDate(new Date());
        clientView.startTime.setSelectedIndex(1);
        clientView.endTime.setSelectedIndex(2);
        clientView.licenceTf.setText("ABC123");

        // Set up the spaceTable
        DefaultTableModel model1111 = (DefaultTableModel) clientView.spaceTable.getModel();
        model1111.setRowCount(0);
        for (ParkingSpace space : parkingSpaces) {
            model1111.addRow(
                    new Object[]{
                            String.valueOf(space.getSpaceID()),
                            space.getStatus() ? "Available" : "Not Available"
                    });
        }
        clientView.spaceTable.setRowSelectionInterval(0, 0);

        clientView.checkoutBtnActionPerformed(null);

        assertNotNull(clientView.isVisible());
       // JOptionPane.showInputDialog("please Select A row");
        assertFalse(clientView.isVisible());
        assertNotNull(extendedBooking);
        assertEquals(2, extendedBooking.getTotalHours());
        assertEquals(12, extendedBooking.getEndTime());
        // Call extendBtnActionPerformed
        clientView.extendBtnActionPerformed(null);
        assertFalse(clientView.isVisible());
        
        clientView.locationTf.setSelectedItem("");
        clientView.jDateChooser1.setDate(new Date());
        clientView.startTime.setSelectedIndex(1);
        clientView.endTime.setSelectedIndex(2);
        clientView.licenceTf.setText("ABC123");

        clientView.checkoutBtnActionPerformed(null);
        JOptionPane.showMessageDialog(null, "All details are required!!!!");
        assertNotNull(clientView.isVisible());

    // Test with null date
        clientView.locationTf.setSelectedItem("Test Location");
        clientView.jDateChooser1.setDate(null);
        clientView.checkoutBtnActionPerformed(null);
        JOptionPane.showMessageDialog(null, "All details are required!!!!");
        assertNotNull(clientView.isVisible());

    // Test with start time equal to end time
        clientView.jDateChooser1.setDate(new Date());
        clientView.startTime.setSelectedIndex(2); // here start and end time is same, which is not accurate
        clientView.endTime.setSelectedIndex(2);
        clientView.checkoutBtnActionPerformed(null);
        JOptionPane.showMessageDialog(null, "Start and End Time should be valid!");
        assertNotNull(clientView.isVisible());

        ParkingLot parkingLot1 = new ParkingLot(1, "Test Location");
        List<ParkingSpace> parkingSpaces1 = parkingLot1.getParkingSpaces();
        parkingSpaces1
                .get(0)
                .setBooking(new Booking(1, new Date(), 1, 1, 9, 12, "ABC123", "test@example.com"));

        // Set up the ClientView
        clientView.locationTf.setSelectedItem("Test Location");
        clientView.jDateChooser1.setDate(new Date());
        clientView.startTime.setSelectedIndex(10);
        clientView.endTime.setSelectedIndex(14);
        clientView.licenceTf.setText("XYZ789");
        clientView.spaceTable.setModel(
                new DefaultTableModel(
                        new Object[][]{{"1", "Available"}}, new String[]{"Space ID", "Status"}));
        clientView.spaceTable.setRowSelectionInterval(0, 0);
        clientView.checkoutBtn.setText("Update");
        clientView.currentBooking =
                new Booking(1, new Date(), 1, 1, 9, 12, "ABC123", "test@example.com");

        // Call the method under test
        clientView.checkoutBtnActionPerformed(null);
        assertEquals("", clientView.licenceTf.getText());
        assertEquals(0, clientView.startTime.getSelectedIndex());
        assertEquals(0, clientView.endTime.getSelectedIndex());
        assertEquals(null, clientView.jDateChooser1.getDate());
        assertEquals(null, clientView.currentBooking);
        assertEquals("Deposit!", clientView.checkoutBtn.getText());
        clientView.loadBookingTable();
        assertNotNull(clientView.isVisible());
        // Test with empty plate number
        clientView.startTime.setSelectedIndex(1);
        clientView.endTime.setSelectedIndex(2);
        clientView.licenceTf.setText("");
        clientView.checkoutBtnActionPerformed(null);
        clientView.checkoutBtn.setText("Update");
        clientView.currentBooking =
                new Booking(1, new Date(), 1, 1, 1, 2, "ABC123", user.getCredentials().getLogin());
        clientView.locationTf.setSelectedItem("");
        clientView.jDateChooser1.setDate(null);
        clientView.startTime.setSelectedIndex(0);
        clientView.endTime.setSelectedIndex(0);
        clientView.licenceTf.setText("");

        // Call the method under test
        clientView.checkoutBtnActionPerformed(null);

        // Set up the test data with invalid start and end times
        clientView.locationTf.setSelectedItem("Test Location");
        clientView.jDateChooser1.setDate(new Date());
        clientView.startTime.setSelectedIndex(2);
        clientView.endTime.setSelectedIndex(1);
        clientView.licenceTf.setText("ABC123");
        JTable bookingTable = new JTable();
        clientView.bookingTable = bookingTable;
        bookingTable.clearSelection();
        clientView.viewBtnActionPerformed(null);
        //JOptionPane.showMessageDialog(null, "please Select A row");
        assertEquals(-1, bookingTable.getSelectedRow());
    
        // Call the method under test
        clientView.checkoutBtnActionPerformed(null);
        // Check that the expected message box = "Start and End Time should be valid!" was shown
        clientView.loadBookingTable();

        List<Booking> bookings11 = new ArrayList<>();
        Booking booking111 = new Booking(1, new Date(), 1, 1, 10, 12, "ABC123", "user1@example.com");
        Booking booking21 = new Booking(2, new Date(), 2, 2, 14, 16, "DEF456", "user2@example.com");
        bookings11.add(booking111);
        bookings11.add(booking21);

        //tableModel Set up
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Start Time");
        tableModel.addColumn("End Time");
        tableModel.addColumn("License Plate");

        for (Booking booking1111 : bookings11) {
            tableModel.addRow(
                    new Object[]{
                            booking1111.getId(),
                            booking1111.getStartTime(),
                            booking1111.getEndTime(),
                            booking1111.getLicensePlate()
                    });
        }

        // table Set up
        JTable bookingTable1 = new JTable(tableModel);
        bookingTable1.setRowSelectionInterval(0, 0); // Select the first row
        clientView.bookingTable = bookingTable1;

        clientView.viewBtnActionPerformed(null);

        JTable spaceTable = new JTable();
        ParkingLot lot = new ParkingLot(1, "XYZ");

        List<Booking> bookings111 = new ArrayList<>();
        Booking booking1111 = new Booking(1, new Date(), 1, 1, 10, 12, "ABC123", "user1@example.com");
        bookings111.add(booking1111);

        List<ParkingSpace> spaces = new ArrayList<ParkingSpace>(100);
        for (int i = 1; i <= 100; i++) {
            spaces.add(new ParkingSpace(i));
        }

        clientView.loadSpaceTable(lot);

        //To check and verify if the space table was loaded correctly
        DefaultTableModel tableModel1 = new DefaultTableModel();
        tableModel1.addColumn("ID");
        tableModel1.addColumn("Location");
        tableModel1.addColumn("Status");

        for (Booking booking11111 : bookings111) {
            tableModel1.addRow(new Object[]{booking11111.getId(), "XYZ-1", "No"});

        }

        assertEquals(lot.getParkingSpaces().size(), 100);
        for (int i = 0; i < tableModel1.getRowCount(); i++) {
            ParkingSpace space = lot.getParkingSpaces().get(i);
            space.setBooking(booking1111);
            assertEquals(tableModel1.getValueAt(i, 0), space.getSpaceID());
            assertEquals(tableModel1.getValueAt(i, 1), lot.getLocation() + "-" + space.getSpaceID());
            if (space.hasBooking() && space.getBooking() != null && space.getBooking().getEmail() != null) {
                assertEquals(tableModel1.getValueAt(i, 2), "No");
            } else {
                assertEquals(tableModel1.getValueAt(i, 2), "Yes");
            }
        }
        
        JTable bookingTable11 = new JTable();
        List<Booking> bookings1111 = new ArrayList<>();
        Booking booking11111 = new Booking(1, new Date(), 1, 2, 19, 23, "ACE-2", "rafd47@my.yorku.ca");
        bookings1111.add(booking11111);

        clientView.loadBookingTable();

        DefaultTableModel tableModel11 = new DefaultTableModel();
        tableModel11.addColumn("getId");
        tableModel11.addColumn("getSpaceId");
        tableModel11.addColumn("getLicensePlate");
        tableModel11.addColumn("getDate");
        tableModel11.addColumn("getTotalHours");
        tableModel11.addColumn("getTotalCost");

        for (Booking booking111111 : bookings1111) {
            tableModel11.addRow(
                    new Object[]{
                            booking111111.getId(),
                            booking111111.getSpaceId(),
                            booking111111.getLicensePlate(),
                            booking111111.getDate().toString(),
                            booking111111.getTotalHours(),
                            booking111111.getTotalCost()
                    });

        }

        assertEquals(1, bookings1111.size());
        for (int i = 0; i < tableModel11.getRowCount(); i++) {
            Booking bookingRecord = bookings1111.get(i);
            assertEquals(tableModel11.getValueAt(i, 0), bookingRecord.getId());
            assertEquals(tableModel11.getValueAt(i, 1), bookingRecord.getSpaceId());
            assertEquals(tableModel11.getValueAt(i, 2), bookingRecord.getLicensePlate());
            assertEquals(tableModel11.getValueAt(i, 3), bookingRecord.getDate().toString());
            assertEquals(tableModel11.getValueAt(i, 4), bookingRecord.getTotalHours());
            assertEquals(tableModel11.getValueAt(i, 5), bookingRecord.getTotalCost());
        }
        ViewDetails viewDetails = new ViewDetails(booking11111);
        assertEquals(booking11111, viewDetails.currentBooking);
        assertNotNull(clientView.isVisible());
        JOptionPane.showMessageDialog(null, "All details are required!!!!");
        assertNotNull(clientView.isVisible());
        
    }
   
}
