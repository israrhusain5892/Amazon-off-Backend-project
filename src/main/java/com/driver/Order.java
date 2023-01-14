package com.driver;

public class Order {

    private String id;
    private int deliveryTime;
    
    public Order(String id, String deliveryTime) {
        this.id=id;
        int h=Integer.parseInt(deliveryTime.split(":")[0]);
        int m=Integer.parseInt(deliveryTime.split(":")[1]);
        // The deliveryTime has to converted from string to int and then stored in the attribute
        //deliveryTime  = HH*60 + MM
        this.deliveryTime=m+h*60;
    }

    public String getId() {
        return id;
    }

    public int getDeliveryTime() {return deliveryTime;}
}
