/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

/**
 *
 * @author User
 * The Car class extends the Vehicle abstract class and is responsible for storing the attributes specific to cars.
 */
public class Car extends Vehicle {

    public Car(String plateNumber, String ownerName) {
        super(plateNumber, ownerName);
    }

    @Override
    public String displayInfo() {
        return "Car plate: " + plateNumber + " Owner: " + ownerName;
    }
    
}
