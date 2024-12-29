package org.example;

import org.example.model.User;

public class UserController {
    public static void main(String[] args) {
        int userId = 1;
        User user = getUserById(userId);

        if (user != null) {
            System.out.println("User ID: " + user.getId());
            System.out.println("User Name: " + user.getName());
        } else {
            System.out.println("Usuário não encontrado.");
        }
    }

    private static User getUserById(int userId) {
        // Simulação de busca de usuário
        if (userId == 1) {
            return new User("Caio", 1);
        }
        return null;
    }
}