package com.tts;

import com.tts.vehicle.Car;

public class Main {

    public static void main(String[] args) {
	Car sportsCar = new Car();
	sportsCar.color = "Red";
	sportsCar.numberOfDoors = 4;
	sportsCar.numWheels = 4;
	sportsCar.start();
	sportsCar.drive();
    sportsCar.stop();
        System.out.println(sportsCar);

	}
}
