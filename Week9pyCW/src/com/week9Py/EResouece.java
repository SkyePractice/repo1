package com.week9Py;

import java.util.ArrayList;

public class EResouece extends Resource{

    //fields
    private ArrayList<EDevice> device;

    //Constructor
    EResouece() {
    }
    //Methods
    public void setDevice(EDevice d) {
        this.device.add(d);
    }


    public void getDevices() {
        System.out.println("Devices are listed:");
        for (EDevice eDevice : device) {
            System.out.println(eDevice.getDetails());
        }
    }
}
