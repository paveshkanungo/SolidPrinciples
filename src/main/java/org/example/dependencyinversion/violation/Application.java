package org.example.dependencyinversion.violation;

public class Application {
    MySqlDatabase db = new MySqlDatabase();

    void start(){
        db.connect();
    }
}
