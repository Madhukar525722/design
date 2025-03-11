package designPatterns.nullPattern;

public class Main {
    public static void main(String args[]){
        Vehicle vehicle = VehicleFactory.getVehicleObject("BIKE");
        printcapacity(vehicle);
    }

    private static void printcapacity(Vehicle vehicle){
        System.out.println(vehicle.fuelCapacity());
    }
}
