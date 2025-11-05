package solid.lsp.solution.impl.engine;

import solid.lsp.solution.abstracttypes.EngineVehicle;

public class Car extends EngineVehicle {

    private boolean isEngineOn = false;
    public int speed = 0;

    public Car () {}

    @Override
    public int getNoOfWheels() {
        return 4;
    }

    @Override
    public void engine() {
        if (!this.isEngineOn){
            this.isEngineOn = true;
        }
        System.out.println("Engine is On");
    }

    public int accelerate () {
        if (this.isEngineOn) {
            this.speed += 10;
        }
        return this.speed;
    }
}
