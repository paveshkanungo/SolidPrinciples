package org.example.openclosed.example2.solution;

public class CardPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Processing Card");
    }
}
