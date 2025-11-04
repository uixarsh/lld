package StrategyDesignPattern.Solution;

import StrategyDesignPattern.Solution.Strategy.NormalDriveStrategy;

public class PassengerVehicle extends Vehicle{
    public PassengerVehicle () {
        super (new NormalDriveStrategy());
    }
}
