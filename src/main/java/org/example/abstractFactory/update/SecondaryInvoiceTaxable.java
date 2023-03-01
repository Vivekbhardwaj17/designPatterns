package org.example.abstractFactory.update;

public class SecondaryInvoiceTaxable  extends SecondaryInvoice {
    private double taxPercentage;
    private double taxAmount;
    @Override
    public Invoice createInvoice() {
        System.out.println("Sec Invoice taxable ...");
        return null;
    }
}
