package com.medium.instance.models.user;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.medium.instance.models.BaseModel;
import com.medium.instance.models.Status;

import javax.persistence.Column;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.UUID;

public class BaseUser extends BaseModel {

    public BaseUser(){

    }

    public BaseUser(UUID id, Date created_at, UUID created_by, Date updated_at, UUID updated_by, Status status, String email, String password) {
        super(id, created_at, created_by, updated_at, updated_by, status);
        this.email = email;
        this.password = password;
    }

    @NotNull
    @Email
    @Column(length = 100, nullable = false)
    private String email;

    @NotNull
    @Size(min = 8, max = 150)
    @Column(length = 150, nullable = false)
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private String password;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
