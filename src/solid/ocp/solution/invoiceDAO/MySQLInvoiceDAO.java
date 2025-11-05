package solid.ocp.solution.invoiceDAO;

import solid.ocp.solution.invoice.Invoice;

public class MySQLInvoiceDAO implements InvoiceDAO {

    private Invoice invoice;

    public MySQLInvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saved Invoice in MySQL Database....");
    }
}
