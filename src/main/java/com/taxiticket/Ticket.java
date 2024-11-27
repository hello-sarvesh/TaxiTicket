
package com.taxiticket;

/**
 *
 * @author Sarvesh Sawant
 */
public class Ticket {

    private String passengerName;
    private String pickLocation;
    private String dropLocation;
    private double distanceInKM;
    private double fare;

    public Ticket() {
    }

    public Ticket(String passengerName, String pickLocation, String dropLocation, double distanceInKM, double fare) {
        this.passengerName = passengerName;
        this.pickLocation = pickLocation;
        this.dropLocation = dropLocation;
        this.distanceInKM = distanceInKM;
        this.fare = fare;
    }

    public String getPassengerName() {
        return passengerName;
    }

    public void setPassengerName(String passengerName) {
        this.passengerName = passengerName;
    }

    public String getPickLocation() {
        return pickLocation;
    }

    public void setPickLocation(String pickLocation) {
        this.pickLocation = pickLocation;
    }

    public String getDropLocation() {
        return dropLocation;
    }

    public void setDropLocation(String dropLocation) {
        this.dropLocation = dropLocation;
    }

    public double getDistanceInKM() {
        return distanceInKM;
    }

    public void setDistanceInKM(double distanceInKM) {
        this.distanceInKM = distanceInKM;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    
    
    
}
