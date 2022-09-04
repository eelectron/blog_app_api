package com.example.blog_app_api.services;

import com.example.blog_app_api.dtos.PostDto;
import com.example.blog_app_api.entities.Category;
import com.example.blog_app_api.entities.User;

import java.util.List;

public interface PostService {

    // create
    PostDto createPost(PostDto postDto, Long userId, Long categoryId);


    // delete
    void deletePost(Long id);

    // update
    PostDto updatePost(PostDto postDto, Long id);

    // get all posts
    List<PostDto> getAllPosts();

    // get single posts
    PostDto getPost(Long id);

    // get all posts by category
    List<PostDto> getAllPostByCategory(Category category);

    // get all post by user
    List<PostDto> getAllPostByUser(User user);


}
