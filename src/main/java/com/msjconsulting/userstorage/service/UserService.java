package com.msjconsulting.userstorage.service;

import com.msjconsulting.userstorage.dao.model.User;

public interface UserService {
    public User save(String name, String password);
}
