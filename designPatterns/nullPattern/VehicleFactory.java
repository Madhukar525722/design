package designPatterns.nullPattern;

public class VehicleFactory {
    Vehicle obj;
    public static Vehicle getVehicleObject(String vehicle){
        if(vehicle.equals("CAR")){
            return new Car();
        }
        return new NullVehicle();
    }
}
