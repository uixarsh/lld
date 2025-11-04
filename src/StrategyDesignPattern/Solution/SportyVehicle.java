package StrategyDesignPattern.Solution;

import StrategyDesignPattern.Solution.Strategy.SpecialDriveStrategy;

public class SportyVehicle extends Vehicle{
    public SportyVehicle () {
        super (new SpecialDriveStrategy());
    }
}
