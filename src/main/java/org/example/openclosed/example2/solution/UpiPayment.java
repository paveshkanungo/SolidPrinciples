package org.example.openclosed.example2.solution;

public class UpiPayment implements Payment{
    @Override
    public void pay() {
        System.out.println("Processing Upi.");
    }
}
