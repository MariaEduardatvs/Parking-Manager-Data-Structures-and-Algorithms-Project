/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

/**
 *
 * @author Maria Eduarda Tavares Berti. The ParkingManager class implements the
 * ParkingOperations interface and contains the main logic of the application.
 */
public class ParkingManager implements ParkingOperations {

    private ArrayList<Car> parkedCars = new ArrayList<>(); //to store parked cars using ArrayList
    private ArrayList<Motorcycle> parkedMotos = new ArrayList<>(); //Store parked motos using ArrayList

    private MyQueue waitingQueue = new MyQueue(); //  to store vehicles in the waiting queue 
    private MyStack parkingHistory = new MyStack(); //to store parking history of the vehicles 

    private int totalCarSpace = 10; //defines the available parking spaces for cars
    private int totalMotorcycleSpace = 5; //defines the available parking spaces for motorcycles

    //add method to add motorcycle and car 
    @Override
    public void addVehicle(Vehicle v) {

        //if have space the car is add to parkedCars, if dont have space, the car is add to waiting queue 
        if (v instanceof Car) {

            if (parkedCars.size() < totalCarSpace) {
                parkedCars.add((Car) v);
                parkingHistory.push(new ParkingRecord("Added", v)); //to register the action to the parkingHistory 
            } else {
                waitingQueue.enqueue(v);
            }

            //if have space on the motorcycle parking the motorcycle is add to parkedMotos, if dont have space, the Motorcycle is add to waiting queue
        } else if (v instanceof Motorcycle) {

            if (parkedMotos.size() < totalMotorcycleSpace) {
                parkedMotos.add((Motorcycle) v);
                parkingHistory.push(new ParkingRecord("Added", v)); //to register the action to the parkingHistory 
            } else {
                waitingQueue.enqueue(v);
            }
        }
    }

    @Override
    //remove method to remove a vehicle from parking 

    //when the user type the plate of the car in the remove space, the car will be removed from the parking space and will be add to history parking 
    public void removeVehicle(String plate) {
        for (int i = 0; i < parkedCars.size(); i++) {

            Car c = parkedCars.get(i);

            if (c.getPlateNumber().equals(plate)) {
                parkedCars.remove(i);
                parkingHistory.push(new ParkingRecord("Removed", c));
                return;
            }
        }

        //when the user type the plate of the motorcycle in the remove space, the motorcycle will be removed from the parking space and will be add to history parking 
        for (int i = 0; i < parkedMotos.size(); i++) {

            Motorcycle m = parkedMotos.get(i);

            if (m.getPlateNumber().equals(plate)) {
                parkedMotos.remove(i);
                parkingHistory.push(new ParkingRecord("Removed", m)); // register the remove action in parkingHistory
                return;
            }
        }
    }

    @Override
    //this update method changes the name of the owner of a parked car or motorcycle using the plate as a reference
    public void updateVehicle(String plate, String newOwner) {
        for (Car c : parkedCars) {
            if (c.getPlateNumber().equals(plate)) {
                c.setOwnerName(newOwner);
                parkingHistory.push(new ParkingRecord("Updated", c)); //to register the update action to the parkingHistory 
                return;
            }
        }

        for (Motorcycle m : parkedMotos) {
            if (m.getPlateNumber().equals(plate)) {
                m.setOwnerName(newOwner);
                parkingHistory.push(new ParkingRecord("Updated", m)); // register the update action to the parkingHistory 
                return;
            }
        }
    }

    //This method shows the available parking spaces for car and motorcycles 
    @Override
    public String viewParkingSpace() {
        int carAvailable = totalCarSpace - parkedCars.size();
        int motoAvailable = totalMotorcycleSpace - parkedMotos.size();

        return "Car parking spaces available: " + carAvailable + "\n" + "Motorcycle parking spaces available: " + motoAvailable;
    }

    public String viewHistory() {
        return parkingHistory.showHistory();
    }

} //end of the class 
