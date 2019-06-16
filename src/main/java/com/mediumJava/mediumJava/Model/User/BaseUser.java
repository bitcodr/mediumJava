package com.mediumJava.mediumJava.Model.User;

import com.mediumJava.mediumJava.Model.BaseModel;

import javax.validation.constraints.NotBlank;
import java.util.UUID;

public class BaseUser extends BaseModel {


    @NotBlank
    private String email;

    public BaseUser(UUID id, int created_at, UUID created_by, int updated_at, UUID updated_by, String email) {
        super(id, created_at, created_by, updated_at, updated_by);
        this.email = email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return email;
    }


}
