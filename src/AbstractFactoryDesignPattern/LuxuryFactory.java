package AbstractFactoryDesignPattern;

public class LuxuryFactory implements VehicleFactory{

    public LuxuryFactory () {

    }

    @Override
    public Vehicle getVehicle(String input) {
        return switch (input){
            case "BMW" -> new BMW();
            case "Mercedes" -> new Mercedes();
            default -> null;
        };
    }
}
