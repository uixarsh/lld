package StrategyDesignPattern.Problem;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List <Vehicle> vehicleList = new ArrayList<>();
        // Concrete Classes
        vehicleList.add(new PassengerVehicle());
        vehicleList.add(new OffRoadVehicle());  // Duplicate Code for classes
        vehicleList.add(new SportyVehicle());   // Duplicate Code for classes

        for (Vehicle vehicle: vehicleList) {
            vehicle.drive();
        }
    }
}
