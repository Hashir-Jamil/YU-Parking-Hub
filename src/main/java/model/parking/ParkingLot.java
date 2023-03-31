package model.parking;

import java.util.ArrayList;
import java.util.List;

//Parking Lot Class. Represents the parking lots.
public class ParkingLot {

    private int LotID;
    private String location;
    private List<ParkingSpace> parkingSpaces;
    private boolean status;

    public ParkingLot(int LotID, String location) {
        this.LotID = LotID;
        this.location = location;
        this.status = true;

        parkingSpaces = new ArrayList<ParkingSpace>(100);

        for (int i = 1; i <= 100; i++) {
            parkingSpaces.add(new ParkingSpace(i));
        }
    }

    public String disableParkingLot() {

        //only disable if parking lot is enabled
        if (this.status == true) {
            //Check if there are any bookings in the parking lot. If there are none, disable parking lot. Else, do not disable parking lot.
            boolean hasBookings = false;
            for (int i = 0; i < 100; i++) {
                ParkingSpace currentSpace = parkingSpaces.get(i);

                //Check if any of the spaces have spaces
                if (currentSpace.hasBooking()) {
                    hasBookings = true;
                    break;
                }
            }
            if (!hasBookings) {
                this.status = !status;
                return "Success: Parking Lot " + this.LotID + " has been disabled.";
            }
        } else {
            return "Parking Lot " + this.LotID + " is already disabled.";
        }

        return "Failure: Parking Lot " + this.LotID + " has active bookings. Parking Lot has not been disabled.";
    }

    public String enableParkingLot() {

        //only enable parking lot if it is disabled.
        if (this.status == false) {
            this.status = true;
            return "Success: Parking Lot " + this.LotID + " has been enabled.";
        } else {
            return "Parking Lot " + this.LotID + " is already enabled.";
        }
    }

    public int getLotID() {
        return LotID;
    }

    public void setLotID(int lotID) {
        LotID = lotID;
    }

    public boolean getStatus() {
        return status;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public List<ParkingSpace> getParkingSpaces() {
        return parkingSpaces;
    }

}
