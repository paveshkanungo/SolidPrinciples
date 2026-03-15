package org.example.openclosed.example2.violation;

public class PaymentProcessor {
    void processPayment(String type){
        if(type.equals("CARD")){
            System.out.println("Processing Card.");
        } else if(type.equals("UPI")){
            System.out.println("Processing UPI.");
        }
        // If anything new needs to be added, then it will be added here.
        // breaking OCP.
    }
}
