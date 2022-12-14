package ru.kata.spring.boot_security.demo.service;

import ru.kata.spring.boot_security.demo.model.User;

import java.util.List;

public interface UserService {
    void addNewUser(User user);
    void editUser(User user);
    User findUserById(Long id);
    User findUserByUsername(String username);
    List<User> findAll();
    void deleteUserById(Long id);
    void update(User user);
}
