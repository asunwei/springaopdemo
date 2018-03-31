package com.learn.service;

import com.learn.entity.UserManager;

public interface UserManagerService {
    public void addUser(String userName, String password);
    public void updateUser(int userId, String userName, String password);
    public void deleteUser(int userId);
    public UserManager findUser(int userId);
}