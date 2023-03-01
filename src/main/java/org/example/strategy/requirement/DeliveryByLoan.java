package org.example.strategy.requirement;

public class DeliveryByLoan extends Delivery{
    @Override
    public void greetingMessage() {
        System.out.println("We know you will pay");
    }
}
