package org.example.dependencyinversion.solution;

public class PostgresSqlDatabase implements Database{
    @Override
    public void connect() {
        System.out.println("Connected to PostgresSqlDatabase");
    }
}
