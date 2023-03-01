package org.example.abstractFactory.update;

public class InvoiceFactory {
    public Invoice createInvoice(String invoiceType, boolean isTaxable) {
        if (invoiceType.equalsIgnoreCase("PRIMARY")) {
            if (isTaxable) {
                return new SecondaryInvoiceTaxable();
            }
            else{
                return new SecondaryInvoiceNonTaxable();
            }
        }
        else if(invoiceType.equalsIgnoreCase("SECONDARY")){
            if(isTaxable){
                return new PrimaryInvoiceTaxable();
            }
            else{
                return new PrimaryInvoiceNonTaxable();
            }
        }
        return null;
    }

}
