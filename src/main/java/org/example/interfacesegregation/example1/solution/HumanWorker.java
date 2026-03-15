package org.example.interfacesegregation.example1.solution;

public class HumanWorker implements Eatable, Workable{

    @Override
    public void eat() {
        System.out.println("Human eating");
    }

    @Override
    public void work() {
        System.out.println("Human working");
    }
}
