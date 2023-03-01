package org.example.strategy.requirement;

public class MainDelivery {
    public static void main(String[] args) {
        Delivery delivery = new Delivery("23-Feb-2023 13:45","AGra  Mathura .....");
        System.out.println("Delivery Price is : "+delivery.deliveryPrice());
        System.out.println("Delivery Profitability status is : "+delivery.deliveryProfitability());
        System.out.println(delivery.publicCheckField);
        System.out.println(delivery.getAvailableCitiesToCaptor());
        System.out.println(Delivery.VISION_CITIES_TO_CAPTURE);

        CashOnDelivery cashOnDelivery = new CashOnDelivery();
        DeliveryByCard deliveryByCard = new DeliveryByCard();
        DeliveryByLoan deliveryByLoan = new DeliveryByLoan();
        DeliveryByUPI deliveryByUPI = new DeliveryByUPI();
        delivery.greetingMessage();
        cashOnDelivery.greetingMessage();
        deliveryByCard.greetingMessage();
        deliveryByLoan.greetingMessage();
        deliveryByUPI.greetingMessage();
    }

}
