package abstractFactory;

public interface InvoiceFactory {
    Invoice createInvoice(int invoiceNumber, String date, double amount, Double exchangeRate);

}
