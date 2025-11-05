package solid.ocp.solution.invoice;

import solid.ocp.solution.marker.Marker;

public class Invoice {
    final private Marker marker;
    final private int qty;
    private int totalPrice;

    public Invoice(Marker marker, int qty) {
        this.marker = marker;
        this.qty = qty;
    }

    public int calculateTotal () {
        this.totalPrice = this.marker.price * this.qty;
        return this.totalPrice;
    }
}
