package solid.lsp.solution.abstracttypes;

import StrategyDesignPattern.Problem.Vehicle;

public abstract class ElectricVehicle extends Vehicle {

    public void motor () {
        System.out.println("This is the Electric Vehicle Motor");
    }
}
