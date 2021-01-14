package com.tts.vehicle;

public class Car {
    public String color;
    public int numWheels;
    public int numberOfDoors;
    public String carType;

    public Car(){}
public Car(String color, int numWheels, int numberOfDoors){
        this.color = color;
        this.numWheels = numWheels;
        this.numberOfDoors = numberOfDoors;
}

    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public int getNumWheels() {
        return numWheels;
    }
    public void setNumWheels(int numWheels) {
        this.numWheels = numWheels;
    }
    public int getNumberOfDoors() {
        return numberOfDoors;
    }
    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public void start(){
        System.out.println("Car starting");
    }
    public void stop(){
        System.out.println("Car stopping");
    }
    public void drive(){
        System.out.println("Car moving");
}
public void drive(int miles){
    System.out.println("Driving for" + miles+" miles");
}
public void drive(int miles, int speed) {
    System.out.println("Driving "+ speed+ " mph for " + miles+" miles.");
}
public void drive(String destination){
    System.out.println("Driving to " + destination);
}

    @Override
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", numWheels=" + numWheels +
                ", numberOfDoors=" + numberOfDoors +
                '}';



    }
}
