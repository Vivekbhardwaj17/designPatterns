package org.example.abstractFactory.update;

public interface Invoice {
    public Invoice createInvoice();
    public Invoice regenerateInvoice();
    public Invoice viewInvoice();
    public Invoice updateInvoice();

}
