package com.msjconsulting.userstorage.dao.repository;

import com.msjconsulting.userstorage.dao.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String>{
}
