package com.medium.instance.models.user;

import com.medium.instance.models.Status;
import com.medium.instance.models.media.Avatar;
import org.hibernate.annotations.Columns;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.Date;
import java.util.UUID;


@Entity(name = "users")  // This tells Hibernate to make a table out of this class
public class WebUser extends BaseUser {

    public WebUser(){

    }

    public WebUser(UUID id, Date created_at, UUID created_by, Date updated_at, UUID updated_by, Status status, String email, String firstName, String lastName, Avatar avatar) {
        super(id, created_at, created_by, updated_at, updated_by, email, status);
        this.firstName = firstName;
        this.lastName = lastName;
        this.avatar = avatar;
    }


    @NotNull(message = "can not be null")
    @Size(min = 5, max = 30)
    @Column(nullable = false, length = 70, unique = true)
    private String firstName, lastName;

    @Columns(columns = {@Column(name = "url"),
            @Column(name = "type"),@Column(name = "height"),
            @Column(name = "width"),@Column(name = "sizeType")})
    @OneToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL,mappedBy = "webUser")
    private Avatar avatar;

    @NotNull
    @Column(length = 400,nullable = false)
    private String emailVerificationToken;

    @NotNull
    @Column(nullable = false)
    private boolean emailISVerified = false;

    public String getEmailVerificationToken() {
        return emailVerificationToken;
    }

    public void setEmailVerificationToken(String emailVerificationToken) {
        this.emailVerificationToken = emailVerificationToken;
    }

    public boolean isEmailISVerified() {
        return emailISVerified;
    }

    public void setEmailISVerified(boolean emailISVerified) {
        this.emailISVerified = emailISVerified;
    }

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

    public Avatar getAvatar() {

        return avatar;
    }

    public void setAvatar(Avatar avatar) {

        this.avatar = avatar;
    }

}
