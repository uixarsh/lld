package StrategyDesignPattern.Solution;

import StrategyDesignPattern.Solution.Strategy.DriveStrategy;

public abstract class Vehicle {
    protected DriveStrategy driveObject;

    public Vehicle (DriveStrategy driveObj) {
        this.driveObject = driveObj;
    }

    public void drive () {
        driveObject.drive();
    }
}
