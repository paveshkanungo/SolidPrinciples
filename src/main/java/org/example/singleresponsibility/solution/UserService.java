package org.example.singleresponsibility.solution;

public class UserService {
    UserRepository repository;
    EmailService emailService;

    void registerUser(User user){
        repository.save(user);
        emailService.sendWelcomeMail(user);
    }
}
