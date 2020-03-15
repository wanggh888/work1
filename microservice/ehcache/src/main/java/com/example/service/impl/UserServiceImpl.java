package com.example.service.impl;

import com.example.dao.UserDao;
import com.example.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;

    @Override
    public void addUser() {
        userDao.save();
    }
}
