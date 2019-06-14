package com.msjconsulting.userstorage.utils.security;


import org.apache.commons.codec.digest.DigestUtils;

public class SHA256Encoder {
    public static String encodeUserNameAndPassword(String name, String password) {
        if (name == null || password == null || name.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("name and password have to be provided and can't be empty");
        }
        return DigestUtils.sha256Hex(name + password);
    }
}
