package org.example.strategy.requirement;

public class DeliveryByCard extends Delivery{
    @Override
    public void greetingMessage() {
        System.out.println("Thanks for paying online");
    }
}
