package org.example.liskovsubstitution.example2.violation;

public class Demo {
    public static void main(String[] args) {
        Motorcycle motorCycle = new Motorcycle("HeroHonda", true, 20);
        Bicyle bicycle = new Bicyle("Hercules", true, 10);

        // use the objects
        // Works fine with MotorCycle - implements all Bike class behavior
        motorCycle.turnOnEngine();
        motorCycle.accelerate();
        motorCycle.applyBrakes();
        motorCycle.turnOffEngine();
        // Client expects to be able to see the same behavior with Bicycle
        bicycle.turnOnEngine(); // fails to implement Bike class behavior
        bicycle.accelerate();
        bicycle.applyBrakes();
        bicycle.turnOffEngine(); // fails to implement Bike class behavior
    }
}
