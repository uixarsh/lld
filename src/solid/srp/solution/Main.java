package solid.srp.solution;

import solid.srp.solution.invoice.Invoice;
import solid.srp.solution.invoice.InvoiceDAO;
import solid.srp.solution.invoice.InvoicePrinter;
import solid.srp.solution.marker.Marker;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Reynolds", "Black", 2024, 70);
        Invoice invoice = new Invoice(marker, 50);

        InvoiceDAO invoiceDAO = new InvoiceDAO(invoice);
        InvoicePrinter invoicePrinter = new InvoicePrinter(invoice);

        int totalPrice = invoice.calculateTotal();
        System.out.println("The Total Price of " + marker.name + " is " + totalPrice);
        invoiceDAO.saveToDB();
        invoicePrinter.printInvoice();
    }
}
