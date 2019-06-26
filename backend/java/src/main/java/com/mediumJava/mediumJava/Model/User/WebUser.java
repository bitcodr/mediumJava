package com.mediumJava.mediumJava.Model.User;

import com.mediumJava.mediumJava.Model.Media.Avatar;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.UUID;


public class WebUser extends BaseUser {

    @NotNull
    private String firstName, lastName;

    private Avatar avatar;

    public WebUser(UUID id, int created_at, UUID created_by, int updated_at, UUID updated_by, String email, String firstName, String lastName, Avatar avatar) {
        super(id, created_at, created_by, updated_at, updated_by, email);
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAvatar(Avatar avatar) {
        this.avatar = avatar;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    public Avatar getAvatar() {
        return avatar;
    }

}
