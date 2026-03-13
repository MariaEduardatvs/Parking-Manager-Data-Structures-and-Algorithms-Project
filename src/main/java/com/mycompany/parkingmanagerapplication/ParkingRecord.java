/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

/**
 *
 * @author Maria Eduarda Tavares Berti Class to store the operations record of
 * the vehicle in the parking
 */
public class ParkingRecord {

    private String operation; //to store operations like add, remove and update
    private Vehicle vehicle; //vehicle 

    //constructor 
    public ParkingRecord(String operation, Vehicle v) {
        this.operation = operation;
        this.vehicle = v;
    }

    public String displayRecord() {
        return operation + " - " + vehicle.displayInfo();
    }
}
