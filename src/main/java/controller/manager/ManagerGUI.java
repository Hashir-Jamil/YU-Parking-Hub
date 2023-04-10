package controller.manager;


import controller.auth.LoginView;
import model.parking.ParkingLot;
import model.parking.ParkingSpace;
import model.user.Credentials;
import model.user.User;
import services.ClientServices;
import services.ManagerServices;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static java.lang.Integer.parseInt;

public class ManagerGUI extends javax.swing.JFrame {

    public User currentManager;
    private JPanel mainManagerPanel;
    private JTable lotTable, spaceTable;
    private DefaultTableModel lotModel, spaceModel;
    private JButton addLotButton, enableLotButton, disableLotButton, enableSpaceButton, disableSpaceButton, logoutButton;
    private JLabel lotTableLabel, spaceTableLabel;


    private ManagerServices pkManager = ManagerServices.getInstance();

    public ManagerGUI(User user) {

//        this.setSize(400, 530);
        this.setSize(500,500);
        currentManager = user;
        pkManager.loadLots();

        //Labels
        lotTableLabel = new JLabel("Parking Lots");
        spaceTableLabel = new JLabel("Parking Spaces");

        lotModel = new DefaultTableModel();
        lotTable = new JTable(lotModel);
        lotModel.addColumn("Lot ID");
        lotModel.addColumn("Location");
        lotModel.addColumn("Status");
        this.loadLotTable();

        //Keeps track of which row is selected
        //https://stackoverflow.com/questions/10128064/jtable-selected-row-click-event
        lotTable.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent listSelectionEvent) {
                //Load the Parking Space according to the selected Parking Lot
                loadSpaceTable();
            }
        });

        JScrollPane lotTableScroll = new JScrollPane(lotTable) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 150);
            }
        };

        // Create the parking space table
        spaceModel = new DefaultTableModel();
        spaceTable = new JTable(spaceModel);
        spaceModel.addColumn("Space ID");
        spaceModel.addColumn("Has Booking?");
        spaceModel.addColumn("Status");

        JScrollPane spaceTableScroll = new JScrollPane(spaceTable) {
            @Override
            public Dimension getPreferredSize() {
                return new Dimension(200, 150);
            }
        };


        // Create buttons to add, enable, and disable parking lots and spaces
        addLotButton = new JButton("Add Parking Lot");
        addLotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                addLot();
            }
        });
        enableLotButton = new JButton("Enable Lot");
        enableLotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableLot();
            }
        });
        disableLotButton = new JButton("Disable Lot");
        disableLotButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disableLot();
            }
        });
        enableSpaceButton = new JButton("Enable Space");
        enableSpaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                enableSpace();
            }
        });
        disableSpaceButton = new JButton("Disable Space");
        disableSpaceButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                disableSpace();
            }
        });
        logoutButton = new JButton("Logout");
        logoutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                logout();
            }
        });

        //Putting Parking Lot buttons in a panel
        JPanel lotButtonsPanel = new JPanel();
        lotButtonsPanel.setLayout(new FlowLayout());
        lotButtonsPanel.add(addLotButton);
        lotButtonsPanel.add(enableLotButton);
        lotButtonsPanel.add(disableLotButton);

        //Putting Parking Spaces button on a panel
        JPanel spaceButtonsPanel = new JPanel();
        spaceButtonsPanel.setLayout(new FlowLayout());
        spaceButtonsPanel.add(enableSpaceButton);
        spaceButtonsPanel.add(disableSpaceButton);

        //Adding all elements to main panel
        mainManagerPanel = new JPanel();
        mainManagerPanel.setLayout(new BoxLayout(mainManagerPanel, BoxLayout.Y_AXIS));
        mainManagerPanel.add(lotTableLabel, BorderLayout.CENTER);
        mainManagerPanel.add(new JLabel(" "));
        mainManagerPanel.add(lotTableScroll);
        mainManagerPanel.add(lotButtonsPanel);
        mainManagerPanel.add(new JSeparator());
        mainManagerPanel.add(spaceTableLabel);
        mainManagerPanel.add(new JLabel(" "));
        mainManagerPanel.add(spaceTableScroll);
        mainManagerPanel.add(spaceButtonsPanel);
        mainManagerPanel.add(logoutButton);

        this.add(mainManagerPanel, BorderLayout.WEST);

        this.setVisible(true);

    }
//
//    public static void main(String[] args) {
//
//        //Testing Sensor Car Observer
//        ManagerServices pkManager = ManagerServices.getInstance();
//
//        pkManager.getAllParkingLots().get(0).getParkingSpaces().get(0).getSensor();
//        JFrame mainFrame = new ManagerGUI(new User(new Credentials("temp", "temp", "Manager")));
//        mainFrame.setTitle("Parking Management System");
//        mainFrame.setSize(400, 530);
//        mainFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        mainFrame.setVisible(true);
//
//    }

    public void addLot() {
        JFrame frame = new JFrame();
        Object result = JOptionPane.showInputDialog(frame, "Enter Parking Lot Location:");

        String newLocation = (String) result;
        int rowCount = lotTable.getRowCount();

        Integer latestID = 0;
        if (rowCount != 0) {
            latestID = parseInt(lotTable.getValueAt(rowCount - 1, 0).toString());
        }

        Integer newID = latestID + 1; //Increment the parking Lot ID
        ParkingLot newParkingLot = new ParkingLot(newID, newLocation);
        pkManager.addParkingLot(newParkingLot);
        for (ParkingLot l : pkManager.getAllParkingLots()) {
            System.out.println(l);
        }
        loadLotTable();
    }

    //loadLotTable updates the parking lot table with the most up to date data
    private void loadLotTable() {

        lotModel.setRowCount(0);

        ArrayList<ParkingLot> pkLots = pkManager.getAllParkingLots();
        int numOfLots = pkLots.size();

        for (int i = 0; i < numOfLots; i++) {
            ParkingLot pkLot = pkLots.get(i);

            Integer currentLotID = pkLot.getLotID();
            String currentLotIDString = currentLotID.toString();
            String currentLotLocation = pkLot.getLocation();
            boolean currentStatus = pkLot.getStatus();

            String stringStatus = "";
            if (currentStatus == true) {
                stringStatus = "Enabled";
            } else {
                stringStatus = "Disabled";
            }
            lotModel.insertRow(lotModel.getRowCount(), new String[]{currentLotIDString, currentLotLocation, stringStatus});
        }
    }

    //loadSpaceTable updates the parking space table with the most up to date data
    private void loadSpaceTable() {

        spaceModel.setRowCount(0);
        int selectedRow = lotTable.getSelectedRow();

        if (selectedRow != -1) {
            ArrayList<ParkingLot> pkLots = pkManager.getAllParkingLots();
            int numOfLots = pkLots.size();

            //Find the ParkingLot object of the selected row
            //Ways to improve is using binary search
            for (int i = 0; i < pkLots.size(); i++) {

                ParkingLot currentLot = pkLots.get(i);
                Integer currentLotID = currentLot.getLotID();
                String selectedID = (String) lotTable.getValueAt(selectedRow, 0);

                //If we found the correct parking lot, add the parking spaces
                if (currentLotID.toString().equals(selectedID)) {

                    ArrayList<ParkingSpace> parkingSpaces = (ArrayList<ParkingSpace>) (currentLot.getParkingSpaces());
                    //Add all the parking lots to the table
                    for (int j = 0; j < 100; j++) {

                        ParkingSpace currentSpace = currentLot.getParkingSpaces().get(j);

                        //Get row details:

                        //SpaceID
                        Integer currentSpaceID = currentSpace.getSpaceID();
                        String currentSpaceIDString = currentSpaceID.toString();
                        //Has Booking?
                        boolean hasBooking = currentSpace.hasBooking();
                        String hasBookingString = "No";
                        if (currentSpace.getBooking() != null)
                            hasBookingString = currentSpace.getBooking().getEmail() == null ? "No" : "Yes";
                        //Space Status
                        boolean currentStatus = currentSpace.getStatus();
                        String statusString = currentStatus ? "Enabled" : "Disabled";

                        spaceModel.insertRow(spaceModel.getRowCount(), new String[]{currentSpaceIDString, hasBookingString, statusString});

                    }
                    break;
                }
            }
            pkManager.updateParkingLots(pkManager.getAllParkingLots()); //temp remove later
        }
    }

    private void disableLot() {

        int selectedRow = lotTable.getSelectedRow();

        JFrame disableNotice = new JFrame();
        if (selectedRow != -1) {
            ArrayList<ParkingLot> pkLots = pkManager.getAllParkingLots();
            for (int i = 0; i < pkLots.size(); i++) {

                ParkingLot currentLot = pkLots.get(i);
                Integer currentLotID = currentLot.getLotID();
                String selectedID = (String) lotTable.getValueAt(selectedRow, 0);

                //If this is the correct lot, then attempt to disable the parking lot and notify
                if (currentLotID.toString().equals(selectedID)) {
                    JOptionPane.showMessageDialog(disableNotice, currentLot.disableParkingLot());
                    pkManager.updateParkingLots(pkLots);
                    this.loadLotTable();
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(disableNotice, "No parking lot is selected.");
        }
    }

    private void enableLot() {

        int selectedRow = lotTable.getSelectedRow();

        JFrame enableNotice = new JFrame();
        if (selectedRow != -1) {
            ArrayList<ParkingLot> pkLots = pkManager.getAllParkingLots();
            for (int i = 0; i < pkLots.size(); i++) {

                ParkingLot currentLot = pkLots.get(i);
                Integer currentLotID = currentLot.getLotID();
                String selectedID = (String) lotTable.getValueAt(selectedRow, 0);

                //If this is the correct parking space, then attempt to disable the parking space and notify
                if (currentLotID.toString().equals(selectedID)) {
                    JOptionPane.showMessageDialog(enableNotice, currentLot.enableParkingLot());

                    this.loadLotTable();
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(enableNotice, "No parking lot is selected.");
        }
    }

    private void enableSpace() {

        int selectedLotRow = lotTable.getSelectedRow();
        int selectedSpaceRow = spaceTable.getSelectedRow();

        JFrame enableNotice = new JFrame();
        if (selectedLotRow != -1 && selectedSpaceRow != -1) {
            ArrayList<ParkingLot> pkLots = pkManager.getAllParkingLots();

            //Find selected lot
            for (int i = 0; i < pkLots.size(); i++) {

                ParkingLot currentLot = pkLots.get(i);
                Integer currentLotID = currentLot.getLotID();
                String selectedLotID = (String) lotTable.getValueAt(selectedLotRow, 0);

                //If this is the correct parking lot, then attempt to enable the selected parking space and notify
                if (currentLotID.toString().equals(selectedLotID)) {
                    //Retrieve the space id
                    String selectedSpaceID = (String) spaceTable.getValueAt(selectedSpaceRow, 0);
                    Integer spaceID = Integer.parseInt(selectedSpaceID);
                    String result = ClientServices.getInstance().enableParkingSpaceById(currentLotID,spaceID);

                    JOptionPane.showMessageDialog(enableNotice, result); //attempt to disable the parking space and notify
                    pkManager.updateParkingLots(pkManager.getAllParkingLots());

                    this.loadSpaceTable();
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(enableNotice, "No parking lot and/or no parking space selected.");
        }
    }

    private void disableSpace() {

        int selectedLotRow = lotTable.getSelectedRow();
        int selectedSpaceRow = spaceTable.getSelectedRow();

        JFrame disableNotice = new JFrame();
        if (selectedLotRow != -1 && selectedSpaceRow != -1) {
            ArrayList<ParkingLot> pkLots = pkManager.getAllParkingLots();

            //Find selected lot
            for (int i = 0; i < pkLots.size(); i++) {

                ParkingLot currentLot = pkLots.get(i);
                Integer currentLotID = currentLot.getLotID();
                String selectedLotID = (String) lotTable.getValueAt(selectedLotRow, 0);

                if (currentLotID.toString().equals(selectedLotID)) {

                    //Retrieve the space id
                    String selectedSpaceID = (String) spaceTable.getValueAt(selectedSpaceRow, 0);
                    Integer spaceID = Integer.parseInt(selectedSpaceID);

                    String result = ClientServices.getInstance().disableParkingSpaceById(currentLotID,spaceID);
                    JOptionPane.showMessageDialog(disableNotice, result); //attempt to disable the parking space and notify
                    pkManager.updateParkingLots(pkManager.getAllParkingLots());

                    this.loadSpaceTable();
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(disableNotice, "No parking lot and/or no parking space selected.");
        }
    }

    private void logout(){
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginView().setVisible(true);
                setVisible(false);

            }
        });
    }

}
