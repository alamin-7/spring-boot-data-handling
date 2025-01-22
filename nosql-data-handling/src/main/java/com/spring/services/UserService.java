package com.spring.services;

import com.spring.models.UserInfo;
import com.spring.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;
    public List<UserInfo> getAllUsers() {
        return userRepository.findAll();
    }
    public UserInfo saveUser(UserInfo user) {
        return userRepository.save(user);
    }
}

