package com.iCornerHappiness.exception;

/**
 * Created by 025329 on 2015/9/29.
 */
public class CornerException extends Exception{
    public CornerException(Exception e) {
        super(e);
    }

    public CornerException(String message) {
        super(message);
    }
}