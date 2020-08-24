package com.example.domain.service;

import com.example.domain.entity.User;
import com.example.domain.exception.EmptyDataException;
import com.example.domain.repository.UserRepository;

import java.util.List;

public class UserDomainService {

    public static final String EMPTY_USERS = "No hay usuarios";
    UserRepository userRepository;

    public List<User> getAllUsers() throws Exception {

        List<User> users = userRepository.getAllUsers();

        if (users.isEmpty())
            throw new EmptyDataException(EMPTY_USERS);

        return users;
    }
}
