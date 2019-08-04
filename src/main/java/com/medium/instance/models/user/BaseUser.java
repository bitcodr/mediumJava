package com.medium.instance.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.medium.instance.models.BaseModel;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;

public class BaseUser extends BaseModel {

    @NotNull
    @Email
    private String email;

    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
