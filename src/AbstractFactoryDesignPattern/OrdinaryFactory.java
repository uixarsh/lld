package AbstractFactoryDesignPattern;

public class OrdinaryFactory implements VehicleFactory{

    public OrdinaryFactory() {

    }

    @Override
    public Vehicle getVehicle(String input) {
        return switch (input){
            case "Swift" -> new Swift();
            case "Hyundai" -> new Hyundai();
            default -> null;
        };
    }
}
