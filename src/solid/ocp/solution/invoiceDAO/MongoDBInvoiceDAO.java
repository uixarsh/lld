package solid.ocp.solution.invoiceDAO;

import solid.ocp.solution.invoice.Invoice;

public class MongoDBInvoiceDAO implements InvoiceDAO {

    private Invoice invoice;

    public MongoDBInvoiceDAO(Invoice invoice) {
        this.invoice = invoice;
    }

    @Override
    public void save() {
        System.out.println("Saved Invoice in MongoDB Database....");
    }
}
