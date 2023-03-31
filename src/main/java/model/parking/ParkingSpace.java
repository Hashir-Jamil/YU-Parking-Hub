package model.parking;

import model.booking.Booking;
import model.sensor.Sensor;


public class ParkingSpace {

    private int spaceID;

    private Booking booking;
    private boolean status;
    private Sensor sensor;

    public ParkingSpace(int spaceID) {
        this.spaceID = spaceID;
        this.status = true;
        sensor = new Sensor();
        booking = null;
    }

    public String disableParkingSpace() {
        //only disable if parking space is enabled
        if (this.status == true) {

            //Check if there are any bookings in the park ing space. If there are none, disable parking space. Else, do not disable parking space.
            if (booking == null) {
                this.status = false;
                return "Success: Parking Space " + this.spaceID + " has been disabled.";
            }
        } else {
            return "Parking Space " + this.spaceID + " is already disabled.";
        }
        return "Failure: Parking Space " + this.spaceID + " has active bookings. Parking Space has not been disabled.";
    }

    public String enableParkingSpace() {

        //only enable parking space if it is disabled.
        if (this.status == false) {
            this.status = true;
            return "Success: Parking Space " + this.spaceID + " has been enabled.";
        } else {
            return "Parking Space " + this.spaceID + " is already enabled.";
        }
    }


    public int getSpaceID() {
        return spaceID;
    }

    public void setSpaceID(int spaceID) {
        this.spaceID = spaceID;
    }

    public boolean hasBooking() {
        return booking != null;
    }

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Sensor getSensor() {
        return this.sensor;
    }

    public boolean getStatus() {
        return this.status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }


}
