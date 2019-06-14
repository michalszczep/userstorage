package com.msjconsulting.userstorage.service.impl;


import com.msjconsulting.userstorage.dao.model.User;
import com.msjconsulting.userstorage.dao.repository.UserRepository;
import com.msjconsulting.userstorage.service.UserService;
import com.msjconsulting.userstorage.utils.security.SHA256Encoder;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@Transactional
public class UserServiceImpl implements UserService {

    private UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(String name, String password) {
        return userRepository.save(new User(name, SHA256Encoder.encodeUserNameAndPassword(name, password)));
    }
}
