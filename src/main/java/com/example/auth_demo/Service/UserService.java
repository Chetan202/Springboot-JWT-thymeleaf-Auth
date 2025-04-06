package com.example.auth_demo.Service;

import com.example.auth_demo.DTO.UserDto;
import com.example.auth_demo.Entity.User;


public interface UserService {
    User findByUsername(String username);

    User save(UserDto userDto);
}