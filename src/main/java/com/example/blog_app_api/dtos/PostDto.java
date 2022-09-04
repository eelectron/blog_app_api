package com.example.blog_app_api.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
public class PostDto {
    private String title;
    private String content;
    private UserDto userDto;
    private CategoryDto categoryDto;
    private Date createdAt;
    private String imageName;
}
