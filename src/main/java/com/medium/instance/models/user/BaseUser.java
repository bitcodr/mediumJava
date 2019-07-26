package com.medium.instance.models.user;

import com.medium.instance.models.BaseModel;
import com.medium.instance.models.Status;

import javax.validation.constraints.NotNull;
import java.util.UUID;

public class BaseUser extends BaseModel {

    @NotNull
    private String email;

//    protected BaseUser(UUID id, int created_at, UUID created_by, int updated_at, UUID updated_by, Status status, String email) {
//        super(id, created_at, created_by, updated_at, updated_by, status);
//        this.email = email;
//    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }
}
