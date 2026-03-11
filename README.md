# Project Overview

Parking Manager is a Java desktop application developed using Object-Oriented Programming and Java Swing GUI.
The system allows users to manage vehicles in a parking area and view available parking spaces.

This project was created for the Data Structures and Algorithms module and follows the Smart Docklands theme: Mobility Innovation.

The application helps manage parking spaces for cars and motorcycles, allowing users to add, remove, update vehicles and check available parking spaces.

# Technologies Used

- Java
- Java Swing (GUI)
- NetBeans IDE
- Object-Oriented Programming
- Data Structures

# Object-Oriented Programming Concepts

### Inheritance

The ```Vehicle``` class is the parent class.
```Car``` and ```Motorcycle``` inherit from the Vehicle class.

### Polymorphism

Polymorphism is demonstrated in the method:

```addVehicle(Vehicle v)```

The system can accept different types of vehicles (Car or Motorcycle) using the same method.

# Data Structures Used (ADT)
The project uses three Abstract Data Types:

### ArrayList

Used to store parked vehicles.

```ArrayList<Car> parkedCars```

```ArrayList<Motorcycle> parkedMotos```

### Queue (LinkedList)

Used to manage vehicles waiting for a parking space.

```Queue<Vehicle> waitingQueue```

Vehicles enter the queue when the parking area is full.

### Stack

Used to store the parking history of removed vehicles.

```Stack<Vehicle> parkingHistory```

# Application Features

The system allows the user to:

- Register a vehicle

- Remove a vehicle

- Update vehicle information

- View available parking spaces

- Manage car and motorcycle parking separately

# Graphical User Interface (GUI)

The application uses Java Swing and was designed using NetBeans GUI Builder.

### Main Dashboard

- The main interface provides four options:

- Register Vehicle

- Manage Vehicle

- View Parking Spaces

- View Parking History Interface

- Exit

# Register Vehicle Interface

This screen allows the user to:

- Enter owner name

- Enter plate number

- Select vehicle type (Car or Motorcycle)

- Add vehicle

- Remove vehicle

- Update vehicle information

# View Parking Spaces Interface

This screen displays the available parking spaces for:

- Cars

- Motorcycles

The information is shown using a text area connected to the ParkingManager logic.


# How to Run the Project

1. Open the project in NetBeans

2. Run the main class:

```ParkingManagerApplication```

3. Use the dashboard to navigate through the system.

# Author

Maria Eduarda Tavares Berti
  
