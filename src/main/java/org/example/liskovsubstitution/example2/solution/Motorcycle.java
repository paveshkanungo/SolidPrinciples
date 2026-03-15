package org.example.liskovsubstitution.example2.solution;

public class Motorcycle implements Bike, Engine{
    private String company;
    private Boolean isEngineOn;
    private int speed;

    public Motorcycle(String company, Boolean isEngineOn, int speed) {
        this.company = company;
        this.isEngineOn = isEngineOn;
        this.speed = speed;
    }

    @Override
    public void accelerate() {
        this.speed = this.speed + 10; // increase the speed
        System.out.println("MotorCycle Speed: " + this.speed);
    }

    @Override
    public void applyBrakes() {
        this.speed = this.speed - 5; // decrease the speed
        System.out.println("MotorCycle Speed: " + this.speed);
    }

    @Override
    public void turnOnEngine() {
        this.isEngineOn = true; // turn on the engine!
        System.out.println("Engine is ON!");
    }

    @Override
    public void turnOffEngine() {
        this.isEngineOn = false; // turn off the engine!
        System.out.println("Engine is OFF!");
    }
}
