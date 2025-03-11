package design;

import design.strategyPattern.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{
    // public void drive(){
    //     System.out.println("Special drive capability");
    // }

    SportsVehicle() {super(new SportsDriveStrategy());}
}