package org.example.strategy.update;

public class CashDeliveryGreeting implements DeliveryGreeting{
    @Override
    public void greetingMessage() {
        System.out.println("Hi Thank you for paying cash...");
    }
}
