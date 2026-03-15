package org.example.liskovsubstitution.example2.violation;

public class Bicyle implements Bike{
    private String brand;
    private Boolean hasGears;
    private int speed;

    public Bicyle(String brand, Boolean hasGears, int speed) {
        this.brand = brand;
        this.hasGears = hasGears;
        this.speed = speed;
    }

    @Override
    public void turnOnEngine() {
        throw new AssertionError("Detail Message: Bicycle has no engine!");
    }

    @Override
    public void turnOffEngine() {
        throw new AssertionError("Detail Message: Bicycle has no engine!");
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10; // increase the speed
        System.out.println("Bicycle Speed: " + this.speed);
    }

    @Override
    public void applyBrakes() {
        this.speed = this.speed - 5; // decrease the speed
        System.out.println("Bicycle Speed: " + this.speed);
    }
}
