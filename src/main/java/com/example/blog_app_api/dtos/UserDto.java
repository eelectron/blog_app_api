package com.example.blog_app_api.dtos;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Getter
@Setter
public class UserDto {
    private int id;

    @NotEmpty
    @Size(min = 4, message = "Username must be of 4 characters .")
    private String name;

    @Email(message = "Email address is not valid .")
    private String email;

    @NotEmpty
    @Size(min = 3, max = 64, message = "Password must have atleast 3 chars and maximum upto 64 chars .")
    private String password;

    @NotEmpty
    private String about;

    public UserDto(){}
}
