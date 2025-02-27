package abstractFactory;

public class LocalInvoiceFactory implements InvoiceFactory{
    @Override
    public Invoice createInvoice(int invoiceNumber, String date, double amount, Double exchangeRate) {
        return new LocalInvoice(invoiceNumber, date, amount);    }
}
