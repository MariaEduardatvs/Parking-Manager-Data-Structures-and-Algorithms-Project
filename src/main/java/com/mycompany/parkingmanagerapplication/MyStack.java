/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

import java.util.ArrayList;

/**
 *
 * @author Maria Eduarda Tavares Berti
 * Class to store vehicle operation records using ParkingRecord objects.
 */
public class MyStack implements StackInterface {
    private ArrayList<ParkingRecord> stack; //create the stack to store ParkingRecord
    
    //constructor 
    public MyStack(){
        stack=new ArrayList<>(); 
    }
    
    
    //method to add a object on the top of the stack
    @Override 
    public void push(Object item){ 
    stack.add(0, (ParkingRecord)item); //convert the object to a ParkingRecord and add to index 0 which is the top of the stack
    }
    
    
    //method to remove the item on the top of the stack
    @Override 
    public Object pop(){
        //check if the stack is not empty
        if(!stack.isEmpty()){
        return stack.remove(0); //remove object on the top of the stack 
        }
        return null; 
    }
    
    @Override 
    //method to check the size of the stack
    public int size(){
        return stack.size(); 
    }
    
    //history of the vehicles 
   public String showHistory() {

    String history = ""; // String to store all the parking history information

    // For each ParkingRecord in the stack
    for (ParkingRecord record : stack) {
        history += record.displayRecord() + "\n"; 
        // Add the record information to the history
        // displayRecord() is a method from the ParkingRecord class that returns the record data
        // "\n" adds a new line to separate each record
    }

    return history; // Return the full history of all records
}

    @Override
    public boolean isEmpty() {
       return stack.isEmpty(); 
    }
    
    
}
