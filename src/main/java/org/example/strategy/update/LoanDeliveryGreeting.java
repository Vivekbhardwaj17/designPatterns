package org.example.strategy.update;

public class LoanDeliveryGreeting implements DeliveryGreeting{
    @Override
    public void greetingMessage() {
        System.out.println("We know you will pay");
    }
}
