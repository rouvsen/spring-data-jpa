package com.rouvsen.exception;

public class ApiRequestException extends RuntimeException{

    public ApiRequestException(String msg){
        super(msg);
    }

    public ApiRequestException(String msg, Throwable cause){
        super(msg, cause);
    }
}
