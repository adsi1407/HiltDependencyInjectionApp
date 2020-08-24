package com.example.domain.repository;

import com.example.domain.entity.User;

import java.util.List;

public interface UserRepository {

    List<User> getAllUsers();

    User getUserById(String id);

    void saveUser(User user);
}
