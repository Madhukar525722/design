package design;

import design.strategyPattern.SportsDriveStrategy;

public class OffVehicle extends Vehicle {
    // public void drive(){
    //     System.out.println("Special drive capability");
    // }

    OffVehicle() {super(new SportsDriveStrategy());}
}