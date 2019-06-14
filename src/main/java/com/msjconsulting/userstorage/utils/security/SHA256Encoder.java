package com.msjconsulting.userstorage.utils.security;


import java.nio.charset.StandardCharsets;

import com.google.common.hash.Hashing;

public class SHA256Encoder {
    public static String encodeUserNameAndPassword(String name, String password) {
        if (name == null || password == null || name.isEmpty() || password.isEmpty()) {
            throw new IllegalArgumentException("name and password have to be provided and can't be empty");
        }
        return Hashing.sha256().hashString(name + password, StandardCharsets.UTF_8).toString();
    }
}
