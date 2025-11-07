package DecoratorDesignPattern;

public class Main {

    public static void main(String[] args) {
        // Margherita + Extra Cheese
        BasePizza pizza = new ExtraCheese(new Margheritta());
        System.out.println(pizza.cost());

        // Margheritta + Extra Cheese + Mushroom
        BasePizza newPizza = new Mushroom(new ExtraCheese(new Margheritta()));
        System.out.println(newPizza.cost());
    }
}
