package org.example.liskovsubstitution.example1.solution;

public class Sparrow extends Bird implements Flyable{
    public void fly(){
        System.out.println("Sparrow Flying");
    }
}
