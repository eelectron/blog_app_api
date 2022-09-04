package com.example.blog_app_api.controllers;

import com.example.blog_app_api.dtos.ApiResponse;
import com.example.blog_app_api.dtos.CategoryDto;
import com.example.blog_app_api.services.CategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/categories")
public class CategoryController {
    @Inject
    private CategoryService categoryService;

    // create
    @PostMapping("/")
    public ResponseEntity<CategoryDto> createCategory(@Valid @RequestBody CategoryDto categoryDto){
        CategoryDto savedCategoryDto = this.categoryService.createCategory(categoryDto);
        ResponseEntity<CategoryDto> response = new ResponseEntity<CategoryDto>(savedCategoryDto, HttpStatus.CREATED);
        return response;
    }

    // update
    @PutMapping("/{id}")
    public ResponseEntity<CategoryDto> updateCategory(@Valid @RequestBody CategoryDto categoryDto, @PathVariable Long id){
        CategoryDto updatedCategoryDto = this.categoryService.updateCategory(categoryDto, id);
        ResponseEntity<CategoryDto> response = new ResponseEntity<CategoryDto>(updatedCategoryDto, HttpStatus.OK);
        return response;
    }

    // delete
    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deleteCategory(@PathVariable Long id){
        this.categoryService.deleteCategory(id);
        ResponseEntity<ApiResponse> response = new ResponseEntity<ApiResponse>(new ApiResponse("Category deleted id " + id, true), HttpStatus.OK);
        return response;
    }

    // get
    @GetMapping("/{id}")
    public ResponseEntity<CategoryDto> getCategory(@PathVariable Long id){
        CategoryDto categoryDto = this.categoryService.getCategory(id);
        ResponseEntity<CategoryDto> response = new ResponseEntity<CategoryDto>(categoryDto, HttpStatus.OK);
        return response;
    }

    // get all
    @GetMapping("/")
    public ResponseEntity<List<CategoryDto>> getAllCategory(){
        List<CategoryDto> categoryDtoList = this.categoryService.getAllCategory();
        ResponseEntity<List<CategoryDto>> response = new ResponseEntity<List<CategoryDto>>(categoryDtoList, HttpStatus.OK);
        return response;
    }
}
