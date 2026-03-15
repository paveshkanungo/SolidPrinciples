package org.example.liskovsubstitution.example1.violation;

public class Penguin extends Bird{
    @Override
    void fly() {
        throw new UnsupportedOperationException("Penguin cannot fly");
    }
}
