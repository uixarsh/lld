package AbstractFactoryDesignPattern;

public class getFactory {

    final private LuxuryFactory luxuryFactory = new LuxuryFactory();
    final private OrdinaryFactory ordinaryFactory = new OrdinaryFactory();

    public getFactory () {

    }

    public Vehicle getVehicleFactory (String car_type, String car_name) {
        return switch (car_type) {
            case "Luxury" -> this.luxuryFactory.getVehicle(car_name);
            case "Ordinary" -> this.ordinaryFactory.getVehicle(car_name);
            default -> null;
        };
    }
}


