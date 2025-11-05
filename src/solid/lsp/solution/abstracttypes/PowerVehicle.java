package solid.lsp.solution.abstracttypes;

import solid.lsp.solution.api.Vehicle;

public abstract class PowerVehicle implements Vehicle {

    @Override
    public int getNoOfWheels() {
        return 0;
    }
}
