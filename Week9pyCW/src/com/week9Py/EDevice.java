package com.week9Py;

public class EDevice {

    //fields
    private String type;
    private String location;
    private boolean availability;

    //Constructor
    public EDevice() {
        type = "";
        location="";
        availability = true;
    }

    //Methods
    public void setType(String t) {
        type = t;
    }

    public void setLocation(String l) {
        location = l;
    }

    public void setAvailability(boolean b) {
        availability = b;
    }

    public String getType() {
        return type;
    }

    public String getLocation() {
        return location;
    }

    public boolean getAvailability() {
        return availability;
    }

    public String getDetails() {
        return type + ", " + location;
    }

    public void printDetails() {
        System.out.println("E-device type: " + type);
        System.out.println("E-device location: " + location);
        if (availability == false) {
            System.out.println("E-device is not available.");
        } else {
            System.out.println("E-device is available");
        }
    }
}
