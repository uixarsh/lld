package solid.srp.solution.invoice;

public class InvoiceDAO {
    private Invoice invoice;

    public InvoiceDAO (Invoice invoice) {
        this.invoice = invoice;
    }

    public void saveToDB () {
        System.out.println("Saving to DB.");
    }
}
