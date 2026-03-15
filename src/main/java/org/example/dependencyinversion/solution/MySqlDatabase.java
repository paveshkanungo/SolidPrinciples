package org.example.dependencyinversion.solution;

public class MySqlDatabase implements Database {

    @Override
    public void connect() {
        System.out.println("Connected to MySql");
    }
}
