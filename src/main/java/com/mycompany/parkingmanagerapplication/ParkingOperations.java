/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

/**
 *
 * @author Maria Eduarda Tavares Berti
 * The ParkingOperations interface defines the core behaviours required in the application, 
 *including adding, removing, updating vehicles, and viewing available parking spaces.
 */
public interface ParkingOperations {
    
    void addVehicle(Vehicle v); 
    void removeVehicle(String plate); 
    void updateVehicle(String plate, String newOwner); 
    String viewParkingSpace(); 
    
}
