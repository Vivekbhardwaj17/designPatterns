package org.example.abstractFactory.update;

public abstract class PrimayInvoice implements Invoice{
    private double totalAmount;
    private String userName;
    private String generateOn;
    private String updatedOn;
    private String regeneratedOn;

    @Override
    public Invoice createInvoice() {
        System.out.println("Created Primay Invoice");
        return null;
    }

    @Override
    public Invoice regenerateInvoice() {
        return null;
    }

    @Override
    public Invoice viewInvoice() {
        return null;
    }

    @Override
    public Invoice updateInvoice() {
        return null;
    }
}
