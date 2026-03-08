/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

/**
 *
 * @author Maria Eduarda Tavares Berti
 * The Motorcycle class extends the Vehicle abstract class and is responsible for storing the attributes specific to motorcycles.
 */
public class Motorcycle extends Vehicle {

    public Motorcycle(String plateNumber, String ownerName) {
        super(plateNumber, ownerName);
    }

    @Override
    public String displayInfo() {
        return "Motorcycle plate: " + plateNumber + " Owner: " + ownerName;
    }
    
    
    
    
}
