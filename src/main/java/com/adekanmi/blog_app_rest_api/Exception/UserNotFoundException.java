package com.adekanmi.blog_app_rest_api.Exception;


import lombok.Getter;

@Getter
public class UserNotFoundException extends RuntimeException{
    private String message;

    public UserNotFoundException(String message) {
        this.message = message;
    }
}

