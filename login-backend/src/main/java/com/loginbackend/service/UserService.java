package com.loginbackend.service;

import com.loginbackend.model.User;
import com.loginbackend.model.UserDto;

public interface UserService {

    User save(UserDto user);
    User findOne(String email);

    User findById(Long id);
}
