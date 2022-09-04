package com.example.blog_app_api.dtos;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.validation.constraints.NotEmpty;

@Getter
@Setter
@NoArgsConstructor
public class CategoryDto {
    private Integer id;

    @NotEmpty
    private String title;
    private String description;
}
