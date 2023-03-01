package org.example.strategy.update;

import org.example.strategy.update.Delivery;

public class MainDelivery {
    public static void main(String[] args) {
        Delivery delivery1 = new Delivery(new CashDeliveryGreeting());
        Delivery delivery2 = new DeliveryByCard(new OnlineDeliveryGreeting());
        Delivery delivery3 = new Delivery(new LoanDeliveryGreeting());
        delivery1.greetingMessage();
        delivery2.greetingMessage();
        delivery3.greetingMessage();
    }

}
