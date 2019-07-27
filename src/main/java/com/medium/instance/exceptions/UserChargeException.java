package com.medium.instance.exceptions;

public class UserChargeException extends RuntimeException {

    static final long serialVersionUID = 7001897190213456939L;

    public UserChargeException(String message) {
        super(message);
    }
}