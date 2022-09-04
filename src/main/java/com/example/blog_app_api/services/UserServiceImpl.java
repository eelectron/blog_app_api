package com.example.blog_app_api.services;

import com.example.blog_app_api.dtos.UserDto;
import com.example.blog_app_api.entities.User;
import com.example.blog_app_api.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class UserServiceImpl implements UserService{
    @Inject
    private UserRepo userRepo;

    @Inject
    private ModelMapper modelMapper;

    @Override
    public UserDto createUser(UserDto userDto) {
        User user = this.modelMapper.map(userDto, User.class);
        User savedUser = userRepo.save(user);
        return userDto;
    }

    @Override
    public UserDto updateUser(UserDto userDto) {
        return null;
    }

    @Override
    public void deleteUser(Long id) {

    }

    @Override
    public UserDto getUser(Long id) {
        return null;
    }

    @Override
    public List<UserDto> getAllUser() {
        return null;
    }
}
