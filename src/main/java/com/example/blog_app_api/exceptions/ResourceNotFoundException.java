package com.example.blog_app_api.exceptions;

public class ResourceNotFoundException  extends RuntimeException{
    private String resourceName;
    private String resourceTitle;
    private Long id;

    public ResourceNotFoundException(String resourceName, String resourceTitle, Long id) {
        super(resourceName);
        this.resourceName = resourceName;
        this.resourceTitle = resourceTitle;
        this.id = id;
    }
}
