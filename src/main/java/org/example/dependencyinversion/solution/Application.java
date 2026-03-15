package org.example.dependencyinversion.solution;

public class Application {
    Database database;

    Application(Database database) {
        this.database = database;
    }

    void start() {
        database.connect();
    }
}
