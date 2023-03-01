package org.example.abstractFactory.update;

public class PrimaryInvoiceTaxable extends PrimayInvoice  {
    @Override
    public Invoice createInvoice() {
        System.out.println("Primary Invoice taxable ...");
        return null;
    }
}
