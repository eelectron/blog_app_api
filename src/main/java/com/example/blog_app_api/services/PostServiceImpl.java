package com.example.blog_app_api.services;

import com.example.blog_app_api.dtos.PostDto;
import com.example.blog_app_api.entities.Category;
import com.example.blog_app_api.entities.User;
import com.example.blog_app_api.repositories.CategoryRepo;
import com.example.blog_app_api.repositories.PostRepo;
import com.example.blog_app_api.repositories.UserRepo;
import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Service;

import javax.inject.Inject;
import java.util.List;

@Service
public class PostServiceImpl implements PostService{
    @Inject
    private PostRepo postRepo;

    @Inject
    private ModelMapper modelMapper;

    @Inject
    private UserRepo userRepo;

    @Inject
    private CategoryRepo categoryRepo;

    @Override
    public PostDto createPost(PostDto postDto, Long userId, Long categoryId) {
        return null;
    }

    @Override
    public void deletePost(Long id) {

    }

    @Override
    public PostDto updatePost(PostDto postDto, Long id) {
        return null;
    }

    @Override
    public List<PostDto> getAllPosts() {
        return null;
    }

    @Override
    public PostDto getPost(Long id) {
        return null;
    }

    @Override
    public List<PostDto> getAllPostByCategory(Category category) {
        return null;
    }

    @Override
    public List<PostDto> getAllPostByUser(User user) {
        return null;
    }
}
