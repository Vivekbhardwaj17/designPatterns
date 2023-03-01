package org.example.strategy.update;

public class Delivery {
    private DeliveryGreeting deliveryGreeting;

    public Delivery(DeliveryGreeting deliveryGreeting) {
        this.deliveryGreeting = deliveryGreeting;
    }

    public void greetingMessage(){
        this.deliveryGreeting.greetingMessage();
    }
}
