package com.example.blog_app_api.services;

import com.example.blog_app_api.dtos.CategoryDto;
import com.example.blog_app_api.entities.Category;
import com.example.blog_app_api.exceptions.ResourceNotFoundException;
import com.example.blog_app_api.repositories.CategoryRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class CategoryServiceImpl implements CategoryService{
    @Inject
    private CategoryRepo categoryRepo;

    @Inject
    private ModelMapper modelMapper;

    @Override
    public CategoryDto createCategory(CategoryDto categoryDto) {
        Category category = this.modelMapper.map(categoryDto, Category.class);
        Category savedCategory = categoryRepo.save(category);
        return this.modelMapper.map(savedCategory, CategoryDto.class);
    }

    @Override
    public CategoryDto updateCategory(CategoryDto categoryDto, Long id) {
        Category category = this.categoryRepo.findById(id).orElseThrow(() -> new ResourceNotFoundException("Category", "Category Id", id));
        category.setDescription(categoryDto.getDescription());
        category.setTitle(categoryDto.getTitle());
        Category savedCategory = this.categoryRepo.save(category);
        return this.modelMapper.map(savedCategory, CategoryDto.class);
    }

    @Override
    public void deleteCategory(Long id) {
        Category category = this.categoryRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category", "Category Id", id));
        this.categoryRepo.delete(category);
    }

    @Override
    public CategoryDto getCategory(Long id) {
        Category category = this.categoryRepo.findById(id)
                .orElseThrow(() -> new ResourceNotFoundException("Category", "Category Id", id));
        return this.modelMapper.map(category, CategoryDto.class);
    }

    @Override
    public List<CategoryDto> getAllCategory() {
        List<Category> categories = this.categoryRepo.findAll();
        List<CategoryDto> categoryDtoList = categories.stream().map(category -> this.modelMapper.map(category, CategoryDto.class))
                .collect(Collectors.toList());
        return categoryDtoList;
    }
}
