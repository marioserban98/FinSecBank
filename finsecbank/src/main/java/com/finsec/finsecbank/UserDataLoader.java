package com.finsec.finsecbank;

import com.finsec.finsecbank.model.User;
import com.finsec.finsecbank.service.UserService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class UserDataLoader implements CommandLineRunner {

    private final UserService userService;

    public UserDataLoader(UserService userService){
        this.userService = userService;
    }

    @Override
    public void run(String... args) throws Exception {
        User user1 = new User("mario", "pass123", "admin");
        userService.saveUser(user1);

        User user2 = new User("robert", "pass1234", "admin");
        userService.saveUser(user2);

        System.out.println("Users added on startup!");
    }
}
