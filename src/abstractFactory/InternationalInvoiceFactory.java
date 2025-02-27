package abstractFactory;

public class InternationalInvoiceFactory implements InvoiceFactory {
    @Override
    public Invoice createInvoice(int invoiceNumber, String date, double amount, Double exchangeRate) {
        if (exchangeRate == null) {
            throw new IllegalArgumentException("Exchange rate is required for international invoices.");
        }
        return new InternationalInvoice(invoiceNumber, date, amount, exchangeRate);    }
}
