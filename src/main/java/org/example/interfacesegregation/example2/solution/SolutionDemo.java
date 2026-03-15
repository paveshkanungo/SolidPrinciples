package org.example.interfacesegregation.example2.solution;

public class SolutionDemo {
    public static void main(String[] args) {
        // Create the objects
        // Now classes only implement what they actually support
        Chef chef = new Chef();
        Waiter waiter = new Waiter();

        // Use the objects
        // These work perfectly - no forced implementations
        chef.prepareFood();
        chef.decideMenu();
        // These work perfectly - no forced implementations
        waiter.takeOrder();
        waiter.serveFoodAndDrinks();
    }
}
