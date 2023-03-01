package org.example.abstractFactory.update;

public abstract class SecondaryInvoice implements Invoice{
    private double totalAmount;
    private String storeName;
    private String userName;
    private String storeAddress;
    private String generateOn;
    private String updatedOn;
    private String regeneratedOn;

    @Override
    public Invoice createInvoice() {
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
