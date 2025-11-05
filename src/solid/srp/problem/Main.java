package solid.srp.problem;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Reynolds", "Blue", 2025, 60);
        Invoice invoice = new Invoice(marker, 10);

        // Methods
        int totalPrice = invoice.calculateTotal();
        System.out.println("The Total Price of " + marker.name + " is " + totalPrice);

        invoice.printInvoice();
        invoice.saveToDB();
    }
}
