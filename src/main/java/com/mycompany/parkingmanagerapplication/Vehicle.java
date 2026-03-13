/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

/**
 *
 * @author Maria Eduarda Tavares Berti
 */
public abstract class Vehicle {
    protected String plateNumber;
    protected String ownerName;

    public Vehicle(String plateNumber, String ownerName) {
        this.plateNumber = plateNumber;
        this.ownerName = ownerName;
    }

    public String getPlateNumber() {
        return plateNumber;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setPlateNumber(String plateNumber) {
        this.plateNumber = plateNumber;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    
    
    
    public abstract String displayInfo();
}
