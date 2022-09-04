package com.example.blog_app_api.controllers;

import com.example.blog_app_api.dtos.PostDto;
import com.example.blog_app_api.services.PostService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;

@RestController
@RequestMapping("/api/post")
public class PostController {
    @Inject
    private PostService postService;

    // create post
    public ResponseEntity<PostDto> createPost(){
        return null;
    }
}
