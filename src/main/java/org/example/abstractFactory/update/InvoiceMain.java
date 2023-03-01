package org.example.abstractFactory.update;

public class InvoiceMain {
    public static void main(String[] args) {
        Invoice invoice = new InvoiceFactory().createInvoice("PRIMARY",true);
        invoice.createInvoice();

        invoice = new InvoiceFactory().createInvoice("PRIMARY",false);
        invoice.createInvoice();

        invoice = new InvoiceFactory().createInvoice("SECONDARY",false);
        invoice.createInvoice();

        invoice = new InvoiceFactory().createInvoice("SECONDARY",true);
        invoice.createInvoice();
    }

}
