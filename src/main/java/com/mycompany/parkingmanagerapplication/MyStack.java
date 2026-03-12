/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

import java.util.ArrayList;

/**
 *
 * @author Maria Eduarda 
 */
public class MyStack implements StackInterface {
    private ArrayList<Vehicle> stack; //create the stack to store vehicles 
    
    //constructor 
    public MyStack(){
        stack=new ArrayList<>(); 
    }
    
    
    //method to add a object on the top of the stack
    @Override 
    public void push(Object item){ 
    stack.add(0, (Vehicle)item); //convert the object to a vehicle and add to index 0 which is the top of the stack
    }
    
    
    //method to remove the item on the top of the stack
    @Override 
    public Object pop(){
        //check if the stack is not empty
        if(!stack.isEmpty()){
        return stack.remove(0); //remove the first object on the top of the stack 
        }
        return null; 
    }
    
    @Override 
    //method to check the size of the stack
    public int size(){
        return stack.size(); 
    }
    
    //history of the vehicles 
    public String showHistory(){
    String history=""; //String to store the information of the vehicles
    //for each Vehicle in the stack 
    for(Vehicle v:stack){
    history+=v.displayInfo(); //add the information from vehicle to the String and displayInfo() which is a method from Vehicle class 
    }
    return history; //retorn all the history 
    }

    @Override
    public boolean isEmpty() {
       return stack.isEmpty(); 
    }
    
    
}
