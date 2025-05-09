package com.learning.backend.service.impl;

import org.springframework.stereotype.Service;

import com.learning.backend.entity.User;
import com.learning.backend.repository.UserRepository;
import com.learning.backend.service.UserService;

@Service
public class UserServiceImpl implements UserService {
    private final UserRepository repo;

    public UserServiceImpl(UserRepository repo){
        this.repo = repo;
    }

    @Override
    public User register(User user) {
        return repo.save(user);
    }
    
}
