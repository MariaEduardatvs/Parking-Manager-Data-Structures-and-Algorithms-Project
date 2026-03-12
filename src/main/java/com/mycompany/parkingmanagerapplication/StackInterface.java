/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

/**
 *
 * @author Maria Eduarda Tavares Berti 
 */
public interface StackInterface {
    
    void push(Object item); // method to add the object on the top of the stack 
    Object pop(); // method to remove the object from the top of the stack 
    boolean isEmpty(); //method to check if the stack is empty or not 
    int size(); //method to retorn the number of objects in the stack 
}
