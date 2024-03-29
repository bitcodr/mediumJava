package com.medium.instance.models.request;

import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import java.io.Serializable;

public class WebUserRequest implements Serializable {

    private static final long serialVersionUID = 1525984938995909597L;

    @NotNull
    @Length(min = 5, max = 30)
    private String firstName, lastName;

    @NotNull
    @Length(min = 5, max = 30)
    private String userName;

    @NotNull
    @Email
    private String email;

    @NotNull
    @Length(min = 8, max = 32)
    private String password;

    @NotNull
    @Length(min = 8, max = 32)
    private String passwordConfirmation;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

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

    public String getPasswordConfirmation() {
        return passwordConfirmation;
    }

    public void setPasswordConfirmation(String passwordConfirmation) {
        this.passwordConfirmation = passwordConfirmation;
    }
}