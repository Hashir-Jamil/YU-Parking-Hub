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
    public void extendBtnActionPerformedWhenNoRowSelected() {

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
    }


    // Should not extend the booking when the selected booking is overdue
    @Test
    public void extendBtnActionPerformedWhenSelectedBookingIsOverdue() {
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
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Start Time");
        model.addColumn("End Time");
        model.addRow(
                new Object[]{
                        String.valueOf(booking.getId()), booking.getStartTime(), booking.getEndTime()
                });
        clientView.bookingTable.setModel(model);
        clientView.bookingTable.setRowSelectionInterval(0, 0);

        // Call the method
        clientView.extendBtnActionPerformed(null);

        assertFalse(clientView.isVisible());

    }

    /**
     * Should show a failure message when the booking cannot be extended
     */
    @Test
    public void extendBtnActionPerformedWhenBookingCannotBeExtended() { // Prepare data
        List<Booking> bookings = new ArrayList<>();
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
        bookings.add(booking);

        // Mock ClientServices
        ClientServices clientServices = ClientServices.getInstance();
        RepositoryProvider repositoryProvider = new RepositoryProvider();
        clientServices.bookingRepository = repositoryProvider.getBookingRepository();;

        // Prepare table
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("ID");
        model.addColumn("Start Time");
        model.addColumn("End Time");
        model.addRow(
                new Object[]{
                        String.valueOf(booking.getId()), booking.getStartTime(), booking.getEndTime()
                });
        clientView.bookingTable.setModel(model);

        // Select the row
        clientView.bookingTable.setRowSelectionInterval(0, 0);

        // Call extendBtnActionPerformed
        clientView.extendBtnActionPerformed(null);
        assertFalse(clientView.isVisible());
    }


     // Should extend the booking when a valid row is selected and extra hours are provided
    @Test
    public void extendBtnActionPerformedWhenValidRowSelectedAndExtraHoursProvided() {
        // data
        List<Booking> bookings = new ArrayList<>();
        Booking booking1 = new Booking(1, new Date(), 1, 1, 10, 12, "ABC123", "user1@example.com");
        Booking booking2 = new Booking(2, new Date(), 1, 2, 14, 16, "DEF456", "user2@example.com");
        bookings.add(booking1);
        bookings.add(booking2);

        // Mock ClientServices
        ClientServices clientServices = ClientServices.getInstance();
        clientServices.bookingRepository.updateBookings(bookings);

        // Set up the booking table
        DefaultTableModel model = (DefaultTableModel) clientView.bookingTable.getModel();
        model.setRowCount(0);
        for (Booking booking : bookings) {
            model.addRow(
                    new Object[]{
                            String.valueOf(booking.getId()),
                            booking.getLicensePlate(),
                            booking.getEmail(),
                            booking.getStartDateTime(),
                            booking.getEndDateTime(),
                            booking.getTotalHours(),
                            booking.getCost()
                    });
        }

        // Select a row in the booking table
        clientView.bookingTable.setRowSelectionInterval(0, 0);

        // Mock JOptionPane input dialog
        JOptionPane.showMessageDialog(null, "Enter Extra Hours: 2");

        // Call the extendBtnActionPerformed method
        clientView.extendBtnActionPerformed(null);

        // Verify the booking is extended
        Booking extendedBooking = clientServices.getBookingById(1);
        assertNotNull(extendedBooking);
        assertEquals(4, extendedBooking.getTotalHours());
        assertEquals(14, extendedBooking.getEndTime());
    }
    
    
    
    @Test
    public void checkoutBtnActionPerformedWhenUpdatingBookingWithoutSelectingRow() {

        clientView.checkoutBtn.setText("Update");
        clientView.currentBooking =
                new Booking(1, new Date(), 1, 1, 1, 2, "ABC123", "test@example.com");
        clientView.spaceTable.clearSelection();

        clientView.checkoutBtnActionPerformed(null);

       // JOptionPane.showInputDialog("please Select A row");
        assertFalse(clientView.isVisible());
    }

    @Test
    public void checkoutBtnActionPerformedWhenProceedingToCheckoutWithValidDetailsAndRowSelected() {
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
        DefaultTableModel model = (DefaultTableModel) clientView.spaceTable.getModel();
        model.setRowCount(0);
        for (ParkingSpace space : parkingSpaces) {
            model.addRow(
                    new Object[]{
                            String.valueOf(space.getSpaceID()),
                            space.getStatus() ? "Available" : "Not Available"
                    });
        }
        clientView.spaceTable.setRowSelectionInterval(0, 0);

        clientView.checkoutBtnActionPerformed(null);

        assertNotNull(clientView.isVisible());
    }


    @Test
    public void checkoutBtnActionPerformedWhenProceedingToCheckoutWithMissingOrInvalidDetails() {
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


        // Test with empty plate number
        clientView.startTime.setSelectedIndex(1);
        clientView.endTime.setSelectedIndex(2);
        clientView.licenceTf.setText("");
        clientView.checkoutBtnActionPerformed(null);
        JOptionPane.showMessageDialog(null, "All details are required!!!!");
        assertNotNull(clientView.isVisible());
    }


    @Test
    public void checkoutBtnActionPerformedWhenUpdatingBookingWithValidDetailsAndRowSelected() {
        ParkingLot parkingLot = new ParkingLot(1, "Test Location");
        List<ParkingSpace> parkingSpaces = parkingLot.getParkingSpaces();
        parkingSpaces
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
    }

    /**
     * Should show an error message when updating booking with missing or invalid details
     */
    @Test
    public void checkoutBtnActionPerformedWhenUpdatingBookingWithMissingOrInvalidDetails() { // Set up
        // the test
        // data
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

        // Call the method under test
        clientView.checkoutBtnActionPerformed(null);
        // Check that the expected message box = "Start and End Time should be valid!" was shown
        clientView.loadBookingTable();

        assertNotNull(clientView.isVisible());
    }

    @Test
    public void viewBtnActionPerformedWhenNoRowSelected() {

        JTable bookingTable = new JTable();
        clientView.bookingTable = bookingTable;
        bookingTable.clearSelection();
        clientView.viewBtnActionPerformed(null);
        //JOptionPane.showMessageDialog(null, "please Select A row");
        assertEquals(-1, bookingTable.getSelectedRow());
    }

    @Test
    public void viewBtnActionPerformedWhenValidRowSelected() {
        List<Booking> bookings = new ArrayList<>();
        Booking booking1 = new Booking(1, new Date(), 1, 1, 10, 12, "ABC123", "user1@example.com");
        Booking booking2 = new Booking(2, new Date(), 2, 2, 14, 16, "DEF456", "user2@example.com");
        bookings.add(booking1);
        bookings.add(booking2);

        //tableModel Set up
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Start Time");
        tableModel.addColumn("End Time");
        tableModel.addColumn("License Plate");

        for (Booking booking : bookings) {
            tableModel.addRow(
                    new Object[]{
                            booking.getId(),
                            booking.getStartTime(),
                            booking.getEndTime(),
                            booking.getLicensePlate()
                    });
        }

        // table Set up
        JTable bookingTable = new JTable(tableModel);
        bookingTable.setRowSelectionInterval(0, 0); // Select the first row
        clientView.bookingTable = bookingTable;

        clientView.viewBtnActionPerformed(null);

        ViewDetails viewDetails = new ViewDetails(booking1);
        assertEquals(booking1, viewDetails.currentBooking);
    }

    @Test
    public void testLoadSpaceTable() {

        JTable spaceTable = new JTable();
        ParkingLot lot = new ParkingLot(1, "XYZ");

        List<Booking> bookings = new ArrayList<>();
        Booking booking1 = new Booking(1, new Date(), 1, 1, 10, 12, "ABC123", "user1@example.com");
        bookings.add(booking1);

        List<ParkingSpace> spaces = new ArrayList<ParkingSpace>(100);
        for (int i = 1; i <= 100; i++) {
            spaces.add(new ParkingSpace(i));
        }

        clientView.loadSpaceTable(lot);

        //To check and verify if the space table was loaded correctly
        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("ID");
        tableModel.addColumn("Location");
        tableModel.addColumn("Status");

        for (Booking booking : bookings) {
            tableModel.addRow(new Object[]{booking.getId(), "XYZ-1", "No"});

        }

        assertEquals(lot.getParkingSpaces().size(), 100);
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            ParkingSpace space = lot.getParkingSpaces().get(i);
            space.setBooking(booking1);
            assertEquals(tableModel.getValueAt(i, 0), space.getSpaceID());
            assertEquals(tableModel.getValueAt(i, 1), lot.getLocation() + "-" + space.getSpaceID());
            if (space.hasBooking() && space.getBooking() != null && space.getBooking().getEmail() != null) {
                assertEquals(tableModel.getValueAt(i, 2), "No");
            } else {
                assertEquals(tableModel.getValueAt(i, 2), "Yes");
            }
        }
    }

    @Test
    public void testLoadBookingTable() {
        JTable bookingTable = new JTable();
        List<Booking> bookings = new ArrayList<>();
        Booking booking1 = new Booking(1, new Date(), 1, 2, 19, 23, "ACE-2", "rafd47@my.yorku.ca");
        bookings.add(booking1);

        clientView.loadBookingTable();

        DefaultTableModel tableModel = new DefaultTableModel();
        tableModel.addColumn("getId");
        tableModel.addColumn("getSpaceId");
        tableModel.addColumn("getLicensePlate");
        tableModel.addColumn("getDate");
        tableModel.addColumn("getTotalHours");
        tableModel.addColumn("getTotalCost");

        for (Booking booking : bookings) {
            tableModel.addRow(
                    new Object[]{
                            booking.getId(),
                            booking.getSpaceId(),
                            booking.getLicensePlate(),
                            booking.getDate().toString(),
                            booking.getTotalHours(),
                            booking.getTotalCost()
                    });

        }

        assertEquals(1, bookings.size());
        for (int i = 0; i < tableModel.getRowCount(); i++) {
            Booking bookingRecord = bookings.get(i);
            assertEquals(tableModel.getValueAt(i, 0), bookingRecord.getId());
            assertEquals(tableModel.getValueAt(i, 1), bookingRecord.getSpaceId());
            assertEquals(tableModel.getValueAt(i, 2), bookingRecord.getLicensePlate());
            assertEquals(tableModel.getValueAt(i, 3), bookingRecord.getDate().toString());
            assertEquals(tableModel.getValueAt(i, 4), bookingRecord.getTotalHours());
            assertEquals(tableModel.getValueAt(i, 5), bookingRecord.getTotalCost());
        }
    }
}
