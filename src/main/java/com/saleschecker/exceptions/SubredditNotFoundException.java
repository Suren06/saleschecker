package com.saleschecker.exceptions;

public class SubredditNotFoundException extends RuntimeException{

    public SubredditNotFoundException(String exeMessage){
        super(exeMessage);
    }
}
