package com.iCornerHappiness.commons;

/**
 * Created by 025329 on 2015/9/29.
 */
public class CommonsException extends Exception{
    public CommonsException(Exception e) {
        super(e);
    }

    public CommonsException(String message) {
        super(message);
    }
}
