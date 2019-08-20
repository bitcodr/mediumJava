package com.medium.instance.models.request;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class WebUserLoginRequest {

    @NotNull
    @Email
    @Length(min = 5, max = 45)
    private String email;

    @NotNull
    @Length(min = 8, max = 32)
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
