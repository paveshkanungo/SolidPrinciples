package org.example.interfacesegregation.example1.solution;

public class Robot implements Workable{

    @Override
    public void work() {
        System.out.println("Robot working");
    }
}
