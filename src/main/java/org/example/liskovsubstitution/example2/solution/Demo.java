package org.example.liskovsubstitution.example2.solution;

public class Demo {
    public static void main(String[] args) {
        // create the objects
        Motorcycle motorCycle = new Motorcycle("HeroHonda", true, 10);
        Bicyle bicycle = new Bicyle("Hercules", true, 10);

        // use the objects
        // Works fine with MotorCycle - implements all Bike class behavior
        motorCycle.turnOnEngine();
        motorCycle.accelerate();
        motorCycle.applyBrakes();
        motorCycle.turnOffEngine();
        // Works fine with Bicycle - implements all Bike class behavior
        bicycle.accelerate();
        bicycle.applyBrakes();
    }

}
