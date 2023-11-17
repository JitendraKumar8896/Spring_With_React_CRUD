package com.spring.SpringFullStack.exception;

public class UserNotFoundException extends Throwable {

    public UserNotFoundException(Long id){
        super("Could not found the user with id "+ id);
    }
}
