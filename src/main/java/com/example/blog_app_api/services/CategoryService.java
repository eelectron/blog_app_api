package com.example.blog_app_api.services;

import com.example.blog_app_api.dtos.CategoryDto;

import java.util.List;

public interface CategoryService {
    // create
    CategoryDto createCategory(CategoryDto categoryDto);

    // update
    CategoryDto updateCategory(CategoryDto categoryDto, Long id);

    // delete
    void deleteCategory(Long id);

    // get
    CategoryDto getCategory(Long id);

    // get all
    List<CategoryDto> getAllCategory();
}
