package solid.srp.solution.invoice;

public class InvoicePrinter {

    private Invoice invoice;

    public InvoicePrinter (Invoice invoice) {
        this.invoice = invoice;
    }

    public void printInvoice () {
        System.out.println("Printing Invoice.");
    }
}
