package ru.shane.spring.usersite.service;


import ru.shane.spring.usersite.model.User;

import java.util.List;

public interface UserService {
    void add(User user);
    List<User> listUsers();

    User getUserById(int id);
    void deleteUserById(int id);

    void updateUser(int id, User user);
}
