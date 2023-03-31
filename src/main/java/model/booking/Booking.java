package model.booking;

import strategy.StrategyHandler;

import java.util.Calendar;
import java.util.Date;

public class Booking {
    private int id;

    private Date startDateTime;
    private Date endDateTime;
    private int lotId;

    private int spaceId;

    private int startTime;
    private int endTime;

    private String licensePlate;
    private double cost;
    private String status;
    private String email;


    public Booking(int id, Date date, int lotId, int spaceId, int startTime, int endTime, String licensePlate, String email) {


        Calendar calendar = Calendar.getInstance();
        calendar.setTime(date);
        calendar.set(Calendar.HOUR_OF_DAY, startTime);
        startDateTime = calendar.getTime();
        Date date2 = new Date(date.getTime());
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTime(date2);
        calendar2.set(Calendar.HOUR_OF_DAY, endTime);
        this.endDateTime = calendar2.getTime();
        this.startDateTime = calendar.getTime();
        this.lotId = lotId;
        this.spaceId = spaceId;
        this.licensePlate = licensePlate;
        this.endTime = endTime;
        this.startTime = startTime;
        this.email = email;
        this.id = id;
        this.cost = StrategyHandler.calculateCost(email).calculateRate(getTotalHours());
    }

    public Booking() {
        this.startDateTime = null;
        this.endDateTime = null;
        this.lotId = 0;
        this.spaceId = 0;
        this.startTime = 0;
        this.endTime = 0;
        this.licensePlate = null;
        this.email = null;
        this.id = 0;
        this.cost = 0;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getStartTime() {
        return startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getEndTime() {
        return endTime;
    }

    public void setEndTime(int endTime) {
        this.endTime = endTime;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getTotalHours() {
        return endTime - startTime;
    }

    public double getTotalCost() {
        return StrategyHandler.calculateCost(email).calculateRate(getTotalHours());
    }

    public Date getDate() {
        return startDateTime;
    }

    public int getLotId() {
        return lotId;
    }

    public int getSpaceId() {
        return spaceId;
    }

    public Date getStartDateTime() {
        return startDateTime;
    }

    public void setStartDateTime(Date startDateTime) {
        this.startDateTime = startDateTime;
    }

    public Date getEndDateTime() {
        return endDateTime;
    }

    public void setEndDateTime(Date endDateTime) {
        this.endDateTime = endDateTime;
    }

    @Override
    public String toString() {
        return
                "\nid             " + id +
                        "\nStart Date Time           " + startDateTime +
                        "\nEnd Date Time        " + endDateTime +
                        "\nlotId          " + lotId +
                        "\nspaceId        " + spaceId +
                        "\nstartTime      " + startTime +
                        "\nendTime        " + endTime +
                        "\nlicensePlate   " + licensePlate + '\'' +
                        "\ncost           " + cost +
                        "\nstatus         " + status + '\'' +
                        "\nemail        " + email;
    }
}

