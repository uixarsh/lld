package StrategyDesignPattern.Solution;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Vehicle> vehicleList = new ArrayList<>();

        vehicleList.add(new PassengerVehicle());
        vehicleList.add(new OffRoadVehicle());
        vehicleList.add(new SportyVehicle());

        for (Vehicle vehicle: vehicleList) {
            vehicle.drive();
        }
    }
}

