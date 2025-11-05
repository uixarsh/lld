package solid.ocp.solution;

import solid.ocp.solution.invoiceDAO.FileInvoiceDAO;
import solid.ocp.solution.invoice.Invoice;
import solid.ocp.solution.invoiceDAO.MongoDBInvoiceDAO;
import solid.ocp.solution.invoiceDAO.MySQLInvoiceDAO;
import solid.ocp.solution.marker.Marker;

public class Main {
    public static void main(String[] args) {
        Marker marker = new Marker("Reynolds", "Pink", 2025, 90);
        Invoice invoice = new Invoice(marker, 324);

        FileInvoiceDAO fileInvoiceDAO = new FileInvoiceDAO(invoice);
        MongoDBInvoiceDAO mongoDBInvoiceDAO = new MongoDBInvoiceDAO(invoice);
        MySQLInvoiceDAO mySQLInvoiceDAO = new MySQLInvoiceDAO(invoice);

        fileInvoiceDAO.save();
        mongoDBInvoiceDAO.save();
        mySQLInvoiceDAO.save();
    }
}
