package org.example.service;

import org.example.model.User;

public class UserService {
    public User getUserById(int id) {
        User user = new User();
        user.setName("Caio");
        user.setAge(25);
        return user;
    }
}
