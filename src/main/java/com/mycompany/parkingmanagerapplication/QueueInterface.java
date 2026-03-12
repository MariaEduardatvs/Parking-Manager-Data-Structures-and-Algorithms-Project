/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

/**
 *
 * @author Maria Eduarda Tavares Berti
 * Interface with the methods to be implemented in the MyQueue class 
 */
public interface QueueInterface {
    void enqueue(Object item); //method to add an object in the end of the queue 
    Object dequeue(); //method to remove an object from the front 
    boolean isEmpty(); //method to check if the queue is empty 
    int size(); //method to check the queue size 
}
