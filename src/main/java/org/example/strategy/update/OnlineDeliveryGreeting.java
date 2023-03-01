package org.example.strategy.update;

public class OnlineDeliveryGreeting implements DeliveryGreeting{
    @Override
    public void greetingMessage() {
        System.out.println("Thanks for Online payment");
    }
}
