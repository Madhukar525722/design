package design;

import design.strategyPattern.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle {
    PassengerVehicle() {super(new NormalDriveStrategy());}
}