package com.medium.instance.exceptions;

public class UserChargeException extends RuntimeException {

    static final long serialVersionUID = 795527661790344946L;

    public UserChargeException(String message) {
        super(message);
    }
}