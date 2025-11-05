package solid.srp.problem;

public class Invoice {
    final private Marker marker;
    final private int qty;
    private int totalPrice;

    public Invoice (Marker marker, int qty) {
        this.marker = marker;
        this.qty = qty;
    }

    public int calculateTotal () {
        this.totalPrice = this.marker.price * this.qty;
        return this.totalPrice;
    }

    public void saveToDB () {
        System.out.println("Saving to DB.");
    }

    public void printInvoice () {
        System.out.println("Printing Invoice.");
    }
}
