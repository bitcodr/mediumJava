package com.medium.instance.models.user;

import com.medium.instance.models.Status;
import com.medium.instance.models.media.Avatar;

import javax.persistence.Entity;
import javax.validation.constraints.NotNull;
import java.util.UUID;


@Entity  // This tells Hibernate to make a table out of this class
public class WebUser extends BaseUser {

    @NotNull
    private String firstName, lastName;

    private Avatar avatar;

    public WebUser(UUID id, int created_at, UUID created_by, int updated_at, UUID updated_by, Status status, String email, String firstName, String lastName, Avatar avatar) {
        super(id, created_at, created_by, updated_at, updated_by, status, email);
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
