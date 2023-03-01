package org.example.strategy.requirement;

/*
* 1. No Args constructor of Delivery class helps us to inherit the properties directly without creating a constructor
*    for CashOnDelivery class.
*
*
* */
public class CashOnDelivery extends Delivery{
    @Override
    public int deliveryPrice() {
        return 2000;
    }

    @Override
    public void greetingMessage() {
        super.greetingMessage();
    }
}
