package solid.ocp.problem;

import solid.ocp.problem.invoice.Invoice;
import solid.ocp.problem.invoice.InvoiceDAO;
import solid.ocp.problem.marker.Marker;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Reynolds", "Green", 2025, 90);
        Invoice invoice = new Invoice(marker, 68);
        InvoiceDAO invoiceDAO = new InvoiceDAO(invoice);

        int totalPrice = invoice.calculateTotal();
        System.out.println(totalPrice);

        invoiceDAO.saveToDB();
        invoiceDAO.saveToFile();
    }
}
