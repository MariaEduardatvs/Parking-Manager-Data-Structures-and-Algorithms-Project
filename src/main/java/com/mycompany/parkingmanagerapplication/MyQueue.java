/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class MyQueue implements QueueInterface{
    private ArrayList<Vehicle>queue; //create the queue 
    
    //constructor 
    public MyQueue(){
    queue=new ArrayList<>(); 
    }
    
    
    //method to add an object in the end of the queue 
    @Override 
    public void enqueue(Object item){
    queue.add((Vehicle)item); 
    }
    
    
    //method to remove the first object in the queue 
    @Override 
    public Object dequeue(){
    if(!queue.isEmpty()){ //check if the queue is not empty 
    return queue.remove(0); //return the first element from the queue in the index 0 and remove it 
    }
    return null; 
    }
    
    //to check if the queue is empty 
    @Override 
    public boolean isEmpty(){
    return queue.isEmpty(); 
    }
    
    
    //method to return the size of the queue
    @Override 
    public int size(){
    return queue.size(); 
    }
}
