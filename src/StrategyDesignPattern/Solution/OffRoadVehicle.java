package StrategyDesignPattern.Solution;

import StrategyDesignPattern.Solution.Strategy.SpecialDriveStrategy;

public class OffRoadVehicle extends Vehicle{
    public OffRoadVehicle () {
        super(new SpecialDriveStrategy());
    }
}
