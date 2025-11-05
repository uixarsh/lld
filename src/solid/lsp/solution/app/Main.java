package solid.lsp.solution.app;

import solid.lsp.solution.impl.engine.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car();
        System.out.println(car.accelerate());
        car.engine();
        System.out.println(car.accelerate());
        System.out.println(car.accelerate());
    }
}
