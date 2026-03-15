package org.example.interfacesegregation.example1.violation;

public class Robot implements Worker{
    public void work(){
        System.out.println("Robot is working");
    }

    public void eat(){
        throw new UnsupportedOperationException("Not possible for Robot.");
    }
}
