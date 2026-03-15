package org.example.singleresponsibility.violation;

public class UserService {
    void registerUser(){
        System.out.println("Saving user to database.");
    }

    void sendWelcomeEmail(User user){
        System.out.println("Sending welcome mail to user.");
    }

    void generateUserReport(User user){
        System.out.println("Generating Report.");
    }
}