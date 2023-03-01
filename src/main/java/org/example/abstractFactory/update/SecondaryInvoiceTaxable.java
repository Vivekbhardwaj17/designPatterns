package org.example.abstractFactory.update;

public class SecondaryInvoiceTaxable  extends SecondaryInvoice {
    @Override
    public Invoice createInvoice() {
        System.out.println("Sec Invoice taxable ...");
        return null;
    }
}
