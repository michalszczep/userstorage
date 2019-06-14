package com.msjconsulting.userstorage.exposure.dto;

import com.msjconsulting.userstorage.dao.model.User;
import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class UserDTO {
    private String name;
    private String hashedPassword;

    public static UserDTO from(User user) {
        return new UserDTO(user.getName(), user.getPassword());
    }

    @Override
    public String toString() {
        return "UserDTO{" +
            "name='" + name + '\'' +
            ", hashedPassword='" + hashedPassword + '\'' +
            '}';
    }
}
