package abstractFactory;

public class LocalInvoice implements Invoice {

    private int invoiceNumber;
    private String date;
    private double amount;

    public LocalInvoice(int invoiceNumber, String date, double amount) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.amount = amount;
    }

    @Override
    public String generateInivoice() {
        return "Factura Local: #" + invoiceNumber + " - Fecha: " + date + " - Monto: $" + amount;
    }

    @Override
    public String getInvoiceDetail() {
        return "Factura Local Detalles: " + generateInivoice();
    }
}
