package com.example.dataaccess.repository;

import com.example.domain.entity.User;
import com.example.domain.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import javax.inject.Inject;

public class UserRepositoryImpl implements UserRepository {

    private List<User> users;

    @Inject
    public UserRepositoryImpl() {
        users = new ArrayList<User>();
        users.add(new User("1", "UserMock1", "3001234455"));
        users.add(new User("2", "UserMock2", "3001236677"));
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }

    @Override
    public User getUserById(String id) {

        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).getId().equals(id)) {
                User user = users.get(i);
                return user;
            }
        }
        return null;
    }

    @Override
    public void saveUser(User user) {

        users.add(user);
    }
}
