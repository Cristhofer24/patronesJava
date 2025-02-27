package abstractFactory;

public class InternationalInvoice implements Invoice {
    private int invoiceNumber;
    private String date;
    private double amount;
    private double exchangeRate;

    public InternationalInvoice(int invoiceNumber, String date, double amount, double exchangeRate) {
        this.invoiceNumber = invoiceNumber;
        this.date = date;
        this.amount = amount;
        this.exchangeRate = exchangeRate;
    }

    @Override
    public String generateInivoice() {
        double amountInLocalCurrency = amount * exchangeRate;
        return "Factura Internacional: #" + invoiceNumber + " - Fecha: " + date + " - Monto: $" + amount +
                " - Tipo de Cambio: " + exchangeRate + " - Monto en Moneda Local: $" + amountInLocalCurrency;
    }

    @Override
    public String getInvoiceDetail() {
        return "Factura Internacional Detalles: " + generateInivoice();
    }
}
