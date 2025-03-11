package design;

import design.strategyPattern.DriveStrategy;
import design.strategyPattern.NormalDriveStrategy;
import design.strategyPattern.SportsDriveStrategy;

public class Vehicle{
    DriveStrategy driveObject;

    Vehicle(DriveStrategy driveObj){
        this.driveObject = driveObj;
    }

    public void drive(){
        driveObject.drive();
    }
}