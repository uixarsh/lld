package AbstractFactoryDesignPattern;

public class Main {
    public static void main(String[] args) {
        getFactory factory = new getFactory();

        Vehicle car = factory.getVehicleFactory("Luxury","BMW");
        car.average();
    }
}
