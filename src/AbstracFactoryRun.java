import abstractFactory.InternationalInvoiceFactory;
import abstractFactory.Invoice;
import abstractFactory.InvoiceFactory;
import abstractFactory.LocalInvoiceFactory;

public class AbstracFactoryRun {
    public static void main(String[] args) {

        // Creación de factura local
        InvoiceFactory localFactory = new LocalInvoiceFactory();
        Invoice localInvoice = localFactory.createInvoice(1, "2023-01-01", 100, null);
        System.out.println(localInvoice.getInvoiceDetail());

        // Creación de factura internacional
        InvoiceFactory internationalFactory = new InternationalInvoiceFactory();
        Invoice internationalInvoice = internationalFactory.createInvoice(2, "2023-01-01", 1000, 1.5);
        System.out.println(internationalInvoice.getInvoiceDetail());
    }
}
