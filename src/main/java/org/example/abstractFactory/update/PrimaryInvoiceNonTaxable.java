package org.example.abstractFactory.update;

public class PrimaryInvoiceNonTaxable extends PrimayInvoice {
    @Override
    public Invoice createInvoice() {
        System.out.println("Primary Invoice Non taxable ...");
        return null;
    }
}
