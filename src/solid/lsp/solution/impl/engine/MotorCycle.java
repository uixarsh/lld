package solid.lsp.solution.impl.engine;

import solid.lsp.solution.abstracttypes.EngineVehicle;

public class MotorCycle extends EngineVehicle {

    private boolean isEngineOn = false;
    public int speed = 0;

    public MotorCycle () {}

    @Override
    public int getNoOfWheels() {
        return 2;
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
            this.speed += 7;
        }
        return this.speed;
    }
}
