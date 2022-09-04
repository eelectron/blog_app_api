package com.example.blog_app_api.services;

import com.example.blog_app_api.dtos.UserDto;

import java.util.List;

public interface UserService {
    UserDto createUser(UserDto userDto);
    UserDto updateUser(UserDto userDto);
    void deleteUser(Long id);
    UserDto getUser(Long id);
    List<UserDto> getAllUser();
}
