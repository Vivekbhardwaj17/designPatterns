package org.example.strategy.requirement;

public class Delivery {
    /*
    * 1. Making field private means if you have Object of that type and available getters and setters for the field then
    *    only you can call or access those fields.
    *
    * 2. There is a option to have public fields and do not create getter setters for that and directly call the fields
    *    instead of calling by getters and setting values by setters but, there are some problems with it.
    *    A - Whenever you are setting values you can add validation for that like it should not null, any other
    *        specifications but, when we are directly storing the values by calling fields and let's say that
    *        field becomes not null nullable in future now you have to make those validation at every place you
    *        set values.
    *    B - Whenever you are accessing values you can directly call your values by calling field by object instead
    *        of calling it by getter method by let's say you inherited those fields in different class now you need
    *        to provide new functionality for those fields. One way is to create separate methods for this use another
    *        is you can override your getters and give required functionality.
    *   C -  In encapsulation we are saying our class is single entity having state and behaviour. We try to use fields
    *        as private entity and keep methods as public.
    *
    * 3. Making field as static means it will create a new copy with every object creation. It will get memory once
    *    can change the value but, it will get changed for whole class context or for all objects.
    *    A - public static fields - It will give access to your field only. As it static so having no relation to
    *        object so, you can call it directly by class name.
    *    B - private static fields - As name suggests it's access but will get reduced to class level now, you can
    *        only access it within class but, for make it available for other classes. You can create getters and
    *        setters to update or set values.
    *
    * 4. Making fields as static final means it will get declared once and initialize once. You cannot create getter
    *    setter for final fields. You can make final fields as private but, you will now able to access it within the
    *    class.
    *  */
    private String partnerName;
    private String deliveryDateAndTime;
    private String deliveryAddress;
    private boolean deliveryAllocated;
    private boolean deliveryDone;
    public String publicCheckField;

    private static int availableCitiesToCaptor = 20;

    public static final int VISION_CITIES_TO_CAPTURE = 20;

    public Delivery(String deliveryDateAndTime, String deliveryAddress) {
        this.deliveryDateAndTime = deliveryDateAndTime;
        this.deliveryAddress = deliveryAddress;
    }

    public Delivery() {
    }

    public int deliveryPrice(){
        return  this.deliveryAddress.length()/2 * 100;
    }

    public boolean deliveryProfitability(){
        return (this.deliveryAddress.length() > this.deliveryDateAndTime.length()) ? true : false;
    }

    public int getAvailableCitiesToCaptor() {
        return availableCitiesToCaptor;
    }

    public void greetingMessage(){
        System.out.println("Hi Thank you for paying cash...");
    }
}
