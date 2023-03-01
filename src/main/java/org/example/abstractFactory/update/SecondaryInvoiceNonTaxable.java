package org.example.abstractFactory.update;

public class SecondaryInvoiceNonTaxable extends SecondaryInvoice {
    @Override
    public Invoice createInvoice() {
        System.out.println("Sec Non Invoice taxable ...");
        return null;
    }
}
