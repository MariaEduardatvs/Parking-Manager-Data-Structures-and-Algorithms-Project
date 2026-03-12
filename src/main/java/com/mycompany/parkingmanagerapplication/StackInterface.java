/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.parkingmanagerapplication;

/**
 *
 * @author User
 */
public interface StackInterface {
    
    void push(Object item); // add the object on the top of the stack 
    Object pop(); // remove the object from the top of the stack 
    boolean isEmpty(); //check if the stack is empty or not 
    int size(); //retorn the number of objects in the stack 
}
